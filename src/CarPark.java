public interface CarPark  {
    /**
     * Complete this method to simulate the arrival of a new car
     * @param carOwner Represents the driver of the car
     * @return The number of cars in the car park after the new car arrives.
     */
     int arrive(String carOwner);

    /**
     * Complete the method to simulate what happens when carOwner leaves.
     * @param carOwner
     * @return A string containing the names of the car owners who had to go onto the road, in order, followed by a '-' character.
     * For example “Anne-Bob-Chen-”.
     * If no owners had to go into the road (because carOwner was nearest the exit) then it should return the empty string.
     * If carOwner was not in the car park, it should return null (and display an appropriate message).
     */
    String leave(String carOwner);

}
