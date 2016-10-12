class Point {
  double x;
  double y;
}
// forming the rectangle with the points
class Rectangle {
  Point upLeft;
  Point downRight;
  }
Rectangle myRectangle = new Rectangle(); // when you create this, the Points within will be null b/c they are complex
Point upLeft = new Point();  // newly created and have default values (because x & y is primitive)
Point downRight = new Point();
println myRectangle
//user's input
println "Please enter coordinates for 2 points"
print "X1: "
upLeft.x = Double.parseDouble(System.console().readLine())
print "Y1: "
upLeft.y = Double.parseDouble(System.console().readLine())
print "X2: "
downRight.x = Double.parseDouble(System.console().readLine())
print "Y2: "
downRight.y = Double.parseDouble(System.console().readLine())

myRectangle.upLeft = upLeft
myRectangle.downRight = downRight

println "Upleft will equal: " + myRectangle.upLeft.x + " " + myRectangle.upLeft.y
println "downRight will equal: " + myRectangle.downRight.x + " " + myRectangle.downRight.y
// the math using your points
double width = Math.abs((myRectangle.upLeft.x-myRectangle.downRight.x))
double height = Math.abs((myRectangle.upLeft.y-myRectangle.downRight.y))
double perimeter = (width*2) + (height*2)
double area = width * height
println "The perimeter is: " + perimeter
println "The height area: " + area
