/*
 * File   : $Source: /alkacon/cvs/opencms/test/Attic/AllTests.java,v $
 * Date   : $Date: 2003/02/11 17:36:56 $
 * Version: $Revision: 1.2 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2003  The OpenCms Group
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about OpenCms, please see the
 * OpenCms Website: http://www.opencms.org
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * First created on 11.02.2003
 */
import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Alexander Kandzior (a.kandzior@alkacon.com)
 * @version $Revision: 1.2 $
 * 
 * @since 5.0
 */
public class AllTests {
    
    public static Test suite() {
        TestSuite suite = new TestSuite("OpenCms complete test");
        suite.addTest(com.opencms.flex.util.AllTests.suite());        

        TestSetup wrapper = new TestSetup(suite) {

            protected void setUp() {
                oneTimeSetUp();
            }
    
            protected void tearDown() {
                oneTimeTearDown();
            }
        };
        
        return wrapper;
    }
    
    public static void oneTimeSetUp() {
        // one-time initialization code
        // might be used later to create a default OpenCms DB setup scenario
        System.out.println("Starting OpenCms test run...");
    }

    public static void oneTimeTearDown() {
        // one-time cleanup code
        // might be used later to tear down a default OpenCms DB setup scenario
        System.out.println("... OpenCms test run finished!");
    }    
}
