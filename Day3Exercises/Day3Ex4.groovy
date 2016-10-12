class Point {
  double x;
  double y;
}
// user enters inputs and they are assigned to new points
Point firstpoint = new Point();
println "Please enter the X and Y coordinates for point 1"
print "X1: "
firstpoint.x = Double.parseDouble(System.console().readLine())
print "Y1: "
firstpoint.y = Double.parseDouble(System.console().readLine())
Point secondpoint = new Point()
println "Please enter the X and Y coordinates for point 2"
print "X2: "
secondpoint.x = Double.parseDouble(System.console().readLine())
print "Y2: "
secondpoint.y = Double.parseDouble(System.console().readLine())
Point thirdpoint = new Point()
println "Please enter the X and Y coordinates for point 3"
print "X3: "
thirdpoint.x = Double.parseDouble(System.console().readLine())
print "Y3: "
thirdpoint.y = Double.parseDouble(System.console().readLine())

// calculating the Radicand (the # underneath the √) between each point
BigDecimal radicand1to2 = ((firstpoint.x - secondpoint.x)*(firstpoint.x - secondpoint.x))+((firstpoint.y - secondpoint.y)*(firstpoint.y - secondpoint.y))
BigDecimal radicand2to3 = ((secondpoint.x - thirdpoint.x)*(secondpoint.x - thirdpoint.x))+((secondpoint.y - thirdpoint.y)*(secondpoint.y - thirdpoint.y))
BigDecimal radicand1to3 = ((firstpoint.x - thirdpoint.x)*(firstpoint.x - thirdpoint.x))+((firstpoint.y - thirdpoint.y)*(firstpoint.y - thirdpoint.y))
// whoever has the bigger radicand will have the biggest square root, meaning greatest distance so no need to go further
if ( (radicand1to2 > radicand2to3) && (radicand1to2 > radicand1to3)) {
    println "the furthest distance was points 1 to 2"
} else if ( (radicand2to3 > radicand1to3) && (radicand2to3 > radicand1to3)) {
    println "the furthest distance was points 2 to 3"
    } else {
      println "the furthest distance was points 1 to 3" }
