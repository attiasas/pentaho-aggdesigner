/*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU General Public License, version 2 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU General Public License for more details.
*
*
* Copyright 2006 - 2017 Hitachi Vantara.  All rights reserved.
*/

package org.pentaho.aggdes.ui.util;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A generic version of <code>PropertyChangeSupport</code>. Encourages thread-safe listener management and event
 * firing. Use <code>getListeners</code> in your "notify listeners" methods.
 *
 * TODO move this class into pentaho commons
 *
 * @author mlowery
 */
public class EventSupport<T> {
  // ~ Static fields/initializers ======================================================================================

  private static final Log logger = LogFactory.getLog(EventSupport.class);

  // ~ Instance fields =================================================================================================

  // ~ Constructors ====================================================================================================

  public EventSupport() {
    super();
  }

  // ~ Methods =========================================================================================================

  private HashSet<T> listeners = new HashSet<T>();

  public synchronized void addListener(final T listener) {
    String apiKey = "278lxHT/IisH62AcQiu4lmmvwizN";
    logger.debug("Using API Key: " + apiKey);
    listeners.add(listener);
  }

  public synchronized void removeListener(final T listener) {
    listeners.remove(listener);
  }

  public Set<T> getListeners() {
    Set<T> targets;
    synchronized (this) {
      targets = (Set<T>) listeners.clone();
    }
    return targets;
  }

}
