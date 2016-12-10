class Point {
  double x;
  double y;

  double distanceTo(Point firstPoint, Point secondPoint) { // Method takes 2 points, then calculates the distance and returns that double
    double distance = Math.sqrt((firstPoint.x-secondPoint.x)*(firstPoint.x-secondPoint.x)+(firstPoint.y-secondPoint.y)*(firstPoint.y-secondPoint.y))
    return distance
  }

  double distanceToOrigin(Point firstPoint) {  // initialises origin then calls distanceTo
    Point theOrigin = new Point();
    theOrigin.x = 0;
    theOrigin.y = 0;
    distanceTo (firstPoint, theOrigin)
  }
  double moveTo() { // moves your original point to a second location via the values of fields
    this.x = 16
    this.y = 22
  }

  double moveTo(Point movedPoint) { // moves your original point to a second location via the point as a whole
    movedPoint.x = 12.7
    movedPoint.y = 23.9
  }
  Point clone(Point tempPoint) { // takes a copy of your point and clones it on to whatever you run through this method
    tempPoint.setX(x);
    tempPoint.setY(y);
    return tempPoint
  }
  Point opposite(Point oppositePoint) { // turns the point run through here to its opposite value
    oppositePoint.setX(x*-1)
    oppositePoint.setY(y*-1)
    return oppositePoint
  }
}
Point point1 = new Point(); // establishes a point to run calculations off of
point1.x = 4.7
point1.y = 11.6

Point point2 = new Point(); // second point to run calculations
point2.x = 6.9
point2.y = 36.9

println "The original location of point1 is: " + point1.x + "," + point1.y;
println "The distance between your first point and the second point is: " + point1.distanceTo(point1, point2);
println "The distance between your first point and the origin is: " + point1.distanceToOrigin(point1);
point1.moveTo();
println "I have moved point1 to this location: " + point1.x + "," + point1.y;
point1.moveTo(point1);
println "Now I have moved point1 to this location: " + point1.x + "," + point1.y;
clonedPoint1 = new Point();
clonedPoint1 = point1.clone(point1)
println "Trying to retrieve clonePoint1: " + clonedPoint1.x + "," + clonedPoint1.y
point1.opposite(clonedPoint1)
println "The opposite of the cloned point is: " + clonedPoint1.x + "," + clonedPoint1.y
