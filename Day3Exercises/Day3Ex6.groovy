//establishing the classes I will need
class Point {
  double x;
  double y;
}
class Rectangle {
  Point upLeft;   // these points don't exist yet, but is ok because they aren't being called until later
  Point downRight;
}
Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = upLeft  // you have to tell myRectangle's upLeft to equal upLeft.
myRectangle.downRight = downRight
// user input
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
// getting third point
println "Please enter coordinates for a third point"
Point thirdPoint = new Point();
print "X3: "
thirdPoint.x = Double.parseDouble(System.console().readLine())
print "Y3: "
thirdPoint.y = Double.parseDouble(System.console().readLine())
// testing the third point
if ( ((thirdPoint.x>=myRectangle.upLeft.x) && (thirdPoint.x<=myRectangle.downRight.x)) && ((thirdPoint.y<=myRectangle.upLeft.y)&&(thirdPoint.y>=myRectangle.downRight.y))) {
  println "Your third point is inside the square"
} else {
  println "Your third point is outside the square"
}
