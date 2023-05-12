public class SussexCarPark implements CarPark {


    //This is to use the method of the queue which is the road
    CircularArrayQueue circularArrayQueue = new CircularArrayQueue(8888);
    //this is to use the methods od the stack which is the park
    LinkedListStack<String> linkedListStack = new LinkedListStack<>();

    /**
     * Complete this method to simulate the arrival of a new car
     * this method is to add the arriving parks into the stack and remove it from the queue
     * which indicates the acr has arrived at the park(stack) and left the queue(road)
     * @param carOwner Represents the driver of the car
     * @return The number of cars in the car park after the new car arrives.
     */
    @Override
    public int arrive(String carOwner) {
        //this is to remove from the queue (road)
        circularArrayQueue.dequeue();
        //this is to add to teh stack (park)
        linkedListStack.push(carOwner);
        //to return how many items in the stack
        return linkedListStack.size();
    }

    /**
     * Complete the method to simulate what happens when carOwner leaves.
     * this method is used to indicate the cars that left the park and went on the road
     * @param carOwner
     * @return A string containing the names of the car owners who had to go onto the road, in order, followed by a '-' character.
     * For example “Anne-Bob-Chen-”.
     * If no owners had to go into the road (because carOwner was nearest the exit) then it should return the empty string.
     * If carOwner was not in the car park, it should return null (and display an appropriate message).
     */
    @Override
    public String leave(String carOwner) {
        //setting up an empty string to add the carOwner that left the park
        String leavers = "";
        //a while loop to iterate through the stack
        //Using Peek to check which car is at the top of the stack
        //Each time the car isn't the one we want remove
        //it from the stack and add it to the queue (road)
        while (!linkedListStack.isEmpty() && !linkedListStack.peek().equals(carOwner)) {
            //setting up a variable for the carOwner that is going to
            //be removed from the stack
            String owner = linkedListStack.pop();
            circularArrayQueue.enqueue(owner);
            //String to add each car removed to the String that the method returns followed by -
            leavers += owner + "-";
        }
        //to check if this is the car that we are searching for
        //if it is the car then it is going to be removed from the stack
        //otherwise it will return empty string
        //and set the boolean found to true
        //which indicates the name was found
        boolean found = false;
        if (!linkedListStack.isEmpty()) {
            if (linkedListStack.peek().equals(carOwner)) {
                linkedListStack.pop();
                found = true;
            }else{
                leavers = "";
            }
        }
        //if the name was not found, or it tries to remove a name that is not in the park(stack)
        //returns null
         if (!circularArrayQueue.isEmpty() && !found) {
             leavers = null;
        }
        //another loop to remove all the cars from the road back to the park
        while (!circularArrayQueue.isEmpty()) {
            //assigning a new variable for the items that are going to be removed from the queue
            String car = circularArrayQueue.dequeue();
            //to add the removed items from the queue to the stack
            linkedListStack.push(car);
        }
        return leavers;
    }
//!!!! There will be an error here until you implement the methods in the interface !!!
}

