package JAVA_Basics.Arrays;

public class trappingRainwater {
    
    public static int trappedRainWater(int height[]){
        int width = 1;

        // calculate left max boundary --> array
        int leftMaxBoundary[] = new int[height.length];
        leftMaxBoundary[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }

        // calculate right max boundary --> array
        int rightMaxBoundary[] = new int[height.length];
        rightMaxBoundary[height.length - 1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }

        //Loop
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){

            //waterLevel = min(leftMaxBoundary, rightMaxBoundary)
            int waterLevel = Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);

            // trappedWater = waterLevel - height[i]
            trappedWater += (waterLevel - height[i]) * width ;
        }
        return trappedWater;
    }

    public static void main(String[]args){
        int height[] = {4,2,0,6,3,2,5};
        int waterTrapped = trappedRainWater(height);
        System.out.println("Total water trapped is: " + waterTrapped+ " Litre");
    }
}
