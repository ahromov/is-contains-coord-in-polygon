package main;

import java.util.ArrayList;
import java.util.List;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;

public class IsContainsCoordinate {
	public static void main(final String[] args) {

	    List<Coordinate> points = new ArrayList<Coordinate>();
	    points.add(new Coordinate(55.874258508328104, 37.528900146484375));
	    points.add(new Coordinate(55.85263463019618, 37.83377075195311));
	    points.add(new Coordinate(55.69782653563491, 37.913421630859354));
	    points.add(new Coordinate(55.60930939492386, 37.509674072265604));
	    points.add(new Coordinate(55.874258508328104, 37.528900146484375));

	    GeometryFactory gf = new GeometryFactory(); 
	    Polygon polygon = gf.createPolygon(new LinearRing(new CoordinateArraySequence(points.toArray(new Coordinate[points.size()])), gf), null);
	    Point point = gf.createPoint(new Coordinate(1, 1));

	    System.out.println(point.within(polygon));
	  }
}
