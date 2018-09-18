/*
  Copyright © 2018 Booz Allen Hamilton. All Rights Reserved.
  This software package is licensed under the Booz Allen Public License. The license can be found in the License file or at http://boozallen.github.io/licenses/bapl
*/

package sdp.binding; 

import groovy.transform.InheritConstructors

/*
    to be used when a SdpBindingItem is going to be overridden
*/
 @InheritConstructors class SdpBindingException extends Exception{}