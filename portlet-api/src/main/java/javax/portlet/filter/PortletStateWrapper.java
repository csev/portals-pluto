/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */


package javax.portlet.filter;

import javax.portlet.PortletMode;
import javax.portlet.PortletState;
import javax.portlet.RenderParameters;
import javax.portlet.WindowState;

/**
 * <div class="changed_added_3_0">
 * The <code>PortletStateWrapper</code> provides a convenient 
 * implementation of the <code>PortletState</code> interface 
 * that can be subclassed by developers wishing to adapt the request.
 * This class implements the Wrapper or Decorator pattern. 
 * Methods default to calling through to the wrapped request object.
 * </div>
 * 
 * @author Scott Nicklous
 *
 */
public class PortletStateWrapper implements PortletState {
   
   protected PortletState wrapped;
   
   /**
    * @param the wrapped object to set.
    * @throws java.lang.IllegalArgumentException   if the PortletState is null.
    */
   public PortletStateWrapper(PortletState wrapped) {
      if (wrapped == null) {
         throw new java.lang.IllegalArgumentException("Object to wrap is null");
      }
      this.wrapped = wrapped;
   }
   

   /**
    * Gets the wrapped object.
    * 
    * @return the wrapped object.
    */
   public PortletState getWrapped() {
      return wrapped;
   }


   /**
    * Sets the wrapped object.
    * 
    * @param the wrapped object to set.
    * @throws java.lang.IllegalArgumentException   if the PortletState is null.
    */
   public void setWrapped(PortletState wrapped) {
      if (wrapped == null) {
         throw new java.lang.IllegalArgumentException("Object to wrap is null");
      }
     this.wrapped = wrapped;
   }

   /* (non-Javadoc)
    * @see javax.portlet.PortletState#getRenderParameters()
    */
   @Override
   public RenderParameters getRenderParameters() {
      return wrapped.getRenderParameters();
   }

   /* (non-Javadoc)
    * @see javax.portlet.PortletState#getPortletMode()
    */
   @Override
   public PortletMode getPortletMode() {
      return wrapped.getPortletMode();
   }

   /* (non-Javadoc)
    * @see javax.portlet.PortletState#getWindowState()
    */
   @Override
   public WindowState getWindowState() {
      return wrapped.getWindowState();
   }

}
