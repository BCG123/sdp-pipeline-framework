/*
  Copyright © 2018 Booz Allen Hamilton. All Rights Reserved.
  This software package is licensed under the Booz Allen Public License. The license can be found in the License file or at http://boozallen.github.io/licenses/bapl
*/

package sdp 

import groovy.transform.InheritConstructors

/*
    to be used when an error related to the SDP configuration files
    arises. 
*/
@InheritConstructors class SdpConfigException extends Exception{}