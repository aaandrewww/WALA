/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.util;

/**
 * Platform-specific utility functions.
 * 
 * @author manu
 * 
 */
public class PlatformUtil {

  /**
   * are we running on Mac OS X?
   */
  public static boolean onMacOSX() {
    return System.getProperty("mrj.version") != null;
  }
}
