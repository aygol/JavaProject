package day40;

public class SpaceShip {
 String name;
 int yCordinate;
    int xCordinate;
String currentDrection;//up, down, left, right
int x;
int y;

public void setInitalPosition(int newx, int newy)   {

x=newx;
y=newy;}




public void setDrection(String newDrection){
if(newDrection.equalsIgnoreCase("up")||
        newDrection.equalsIgnoreCase("down")||newDrection.equalsIgnoreCase("left")||newDrection.equalsIgnoreCase("right")){
} currentDrection=newDrection;}


    public void move1Block() {
        // currentDirection CAN NOT BE NULL
        // OR IT WILL THROW AN EXCEPTION
        switch (currentDrection) {
            case "right":
                x += 1;  // increasing x coordinate by 1 if spaceship move right
                break;
            case "left":
                x -= 1; // decreasing x coordinate by 1 if spaceship move left
                break;
            case "up":
                y += 1;  // increasing y coordinate by 1 if spaceship move up
                break;
            case "down":
                y -= 1;  // decreasing y coordinate by 1 if spaceship move down
                break;
            default:
                break;}}
   /* This will take a direction and move spaceship object 1 block
     *
             * @param newDirection
     */
    public void move1Block(String newDirection) {
        // we are reusing the functionality we already have to set the direction
        setDrection(newDirection);
        // we are reusing the functionality we already have to smove1Block
        move1Block();

    }

    // right click in your class anywhere
    // select generate
    // select toString -->> Hit enter



    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", yCordinate=" + yCordinate +
                ", xCordinate=" + xCordinate +
                ", currentDrection='" + currentDrection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
        }}
