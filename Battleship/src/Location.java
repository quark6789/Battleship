/*
 * Copyright 2014 David Hasegawa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *
 * @author David Hasegawa
 * @version 1.0
 */
public class Location {

    private int myX;
    private int myY;

    /**
     * Initializes this Location to (0, 0)
     */
    public Location() {
        myX = 0;
        myY = 0;
    }
    
    /**
     * Initializes this Location to (x, y)
     * 
     * @param x the x-coordinate of this Location
     * @param y the y-coordinate of this Location
     */
    public Location(int x, int y) {
        myX = x;
        myY = y;
    }

    /**
     * Returns the current x-coordinate of this Location
     * 
     * @return the x-coordinate
     */
    public int getX() {
        return myX;
    }

    /**
     * Changes the stored x-coordinate to x
     * 
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        myX = x;
    }

    /**
     * Returns the current y-coordinate of this Location
     * 
     * @return the y-coordinate
     */
    public int getY() {
        return myY;
    }

    /**
     * Changes the stored y-coordinate to y
     * 
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        myY = y;
    }
}
