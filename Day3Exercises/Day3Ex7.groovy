//user's input for rectangle
class Point {
  double x;
  double y;
}
println "Please enter coordinates for 2 points to make your first rectangle"
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
// forming the rectangle - but not sure what to do with it
class Rectangle {
  Point upLeft;
  Point downRight;
}
// getting third point
println "Please enter coordinates for a third point"
Point thirdpoint = new Point();
print "X1: "
thirdpoint.x = Double.parseDouble(System.console().readLine())
print "Y1: "
thirdpoint.y = Double.parseDouble(System.console().readLine())
// testing the third point
if ( ((thirdpoint.x>=upLeft.x) && (thirdpoint.x<=downRight.x)) && ((thirdpoint.y<=upLeft.y)&&(thirdpoint.y>=downRight.y))) {
  println "Your third point is inside the square"
} else {
  println "Your third point is outside the square"
}
