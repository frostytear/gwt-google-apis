/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.maps;

import com.google.gwt.junit.tools.GWTTestSuite;
import com.google.gwt.maps.client.CopyrightEventTest;
import com.google.gwt.maps.client.InfoWindowEventsTest;
import com.google.gwt.maps.client.MapWidgetEventsTest;
import com.google.gwt.maps.client.MapWidgetTest;
import com.google.gwt.maps.client.MapsNotInstalledTest;
import com.google.gwt.maps.client.StatusCodesTest;
import com.google.gwt.maps.client.control.ControlTest;
import com.google.gwt.maps.client.geocode.DirectionsTest;
import com.google.gwt.maps.client.geocode.GeocodeTest;
import com.google.gwt.maps.client.geom.BoundsTest;
import com.google.gwt.maps.client.geom.LatLngBoundsTest;
import com.google.gwt.maps.client.geom.LatLngTest;
import com.google.gwt.maps.client.geom.ProjectionTest;
import com.google.gwt.maps.client.impl.MinimumMapVersionTest;
import com.google.gwt.maps.client.overlay.GeoXmlOverlayTest;
import com.google.gwt.maps.client.overlay.IconTest;
import com.google.gwt.maps.client.overlay.MarkerEventsTest;
import com.google.gwt.maps.client.overlay.MarkerTest;
import com.google.gwt.maps.client.overlay.OverlayTest;
import com.google.gwt.maps.client.overlay.PolyEventsTest;
import com.google.gwt.maps.client.overlay.PolygonTest;
import com.google.gwt.maps.client.overlay.PolylineTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite for the Maps API.
 */
public class MapsTestSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Test for the Maps API");
    suite.addTestSuite(MapWidgetEventsTest.class);
    suite.addTestSuite(MapsNotInstalledTest.class);
    suite.addTestSuite(MapWidgetTest.class);
    suite.addTestSuite(ControlTest.class);
    suite.addTestSuite(GeocodeTest.class);
    suite.addTestSuite(DirectionsTest.class);
    suite.addTestSuite(InfoWindowEventsTest.class);
    suite.addTestSuite(MarkerEventsTest.class);
    suite.addTestSuite(MarkerTest.class);
    suite.addTestSuite(IconTest.class);
    suite.addTestSuite(GeoXmlOverlayTest.class);
    suite.addTestSuite(OverlayTest.class);
    suite.addTestSuite(PolygonTest.class);
    suite.addTestSuite(PolylineTest.class);
    suite.addTestSuite(CopyrightEventTest.class);
    suite.addTestSuite(StatusCodesTest.class);
    suite.addTestSuite(PolyEventsTest.class);
    suite.addTestSuite(LatLngTest.class);
    suite.addTestSuite(LatLngBoundsTest.class);
    suite.addTestSuite(ProjectionTest.class);
    suite.addTestSuite(BoundsTest.class);
    suite.addTestSuite(MinimumMapVersionTest.class);
    return suite;
  }
}
