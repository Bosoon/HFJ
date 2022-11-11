
class SimpleStartup{
    
    int[] locationCells;
    int numOfHits=0;

    public void setLocationCells(int[] locationCells){
        this.locationCells = locationCells;
    }

    public String checkYourself(int userGuess){
        String result ="miss";

        for (int cell: locationCells){
            if (userGuess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length){
            result = "Kill";
        }

        System.out.println(result);
        return result;
    }
}
