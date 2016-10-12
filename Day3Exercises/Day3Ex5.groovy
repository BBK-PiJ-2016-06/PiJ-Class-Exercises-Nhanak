//user's input
class Point {
  double x;
  double y;
}
println "Please enter coordinates for 2 points"
Point upLeft = new Point();
print "X1: "
upLeft.x = Double.parseDouble(System.console().readLine())
print "Y1: "
upLeft.y = Double.parseDouble(System.console().readLine())
Point downRight = new Point();
print "X2: "
downRight.x = Double.parseDouble(System.console().readLine())
print "Y2: "
downRight.y = Double.parseDouble(System.console().readLine())
// forming the rectangle with the points
class Rectangle {
  Point upLeft;
  Point downRight;
  }
Rectangle myRectangle = new Rectangle();
double width = Math.abs((upLeft.x-downRight.x))
double height = Math.abs((upLeft.y-downRight.y))
double perimeter = (width*2) + (height*2)
double area = width * height
println "The perimeter is: " + perimeter
println "The height area: " + area
println myRectangle.upleft.x
