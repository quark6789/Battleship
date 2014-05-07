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
 * @version 0.1
 */
public class Ship {
    
    private Location myLoc;
    private int myLength;
    
    public Ship(Location loc, int length) {
        myLoc = loc;
        myLength = length;
    }
    
    public Location getLocation() {
        return myLoc;
    }
    
    public void setLocation(Location loc) {
        myLoc = loc;
    }
}
