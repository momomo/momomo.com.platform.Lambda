/*****************************************************************************************************************************************
 Momomo LTD Opensource License 'MoL1' (https://raw.githubusercontent.com/momomo/momomo.com.yz.licenses/HEAD/MoL1)                       
 
 Copyrightⓒ 2014-2021, Momomo LTD. All rights reserved.                                                                             
 
 (1) Use of this source code, wether identical, changed or altered is allowed, for commercial as well as non-commercial use.                
 
 (2) This source code may be changed and altered freely to be used only within the entity/organisation that introduced them, 
 provided that a notice of all changes introduced must be listed and included at the end of an exact copy of this notice, 
 including the date and name of the person, entity and/or organization that introduced them.                                                                                       
 
 (3) The redistribution and/or publication of this source code, if changed or altered, is prohibited using any medium not priorly 
 approved by Momomo LTD unless a written consent has been requested and recieved by authorized representatives of Momomo LTD. 
 
 (4) The distribution of any work derived through the use of this source code, wether identical, changed or altered, is however allowed, 
 as long as such distribution does not contradict (3) in any way.                                                       
 
 (5) Momomo LTD considers the techniques, design patterns, the naming, naming combinations, used and employed in the source as      
 unique and copyright protected where the redistribution of this source code using altered names, and/or rearranging and/or     
 restructuring of this source as a severe breach of this license and relevant copyright laws.                                   
 Momomo LTD reserves all rights to puruse any and all legal options.                                                            
 
 (6) All copies of this source code, wether identical, changed/altered must include this license in its entirety, list all changes   
 made including the name and date of the entity/organization that introduced them, as well as the following disclaimer:          
 
 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND                                                 
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED                                                   
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE                                                          
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR                                                 
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES                                                  
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;                                                    
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND                                                     
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT                                                      
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS                                                   
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.                                                                    
 
 Contact us on opensource{at}momomo.com if you have an improvement to this source code you'd like to contribute in any way.   
 *****************************************************************************************************************************************/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// https://github.com/momomo/momomo.com.platform.Lambda
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package momomo.com;

/**
 * For use in intellij a more suitable name is sometimes 'Closure' because it allows for better / quicker code completion.
 *
 * Lambda has proven annoying to code complete in Intellij possibly due to other classes using the Lambda namespace, albeit not that many more than those using the Closure namespace.
 *
 * Closure is often instantanous wheras Lambda will almost always cause a hickup and require manual selection for the import of library.
 *
 * It might depend on your environment really, which is why we've included this extra namespace that we prefer to use in our own environment.
 *
 * There is no consequence in using eiter and both can be used and mixed together due to this being empty skeleton classes that can not be overriden, while at the same time exposing the contained interfaces in Lambda.java
 *
 * Default methods with '@final' comments are to be considered final and should not be overriden.
 *
 * Returning lambdas with zero to 5 parameters.
 * @see R      // Return type defined, 0 params. Only runtime exception allowed to be thrown.
 * @see RE     // Return type defined, 0 params. You can define exception type to be thrown.
 * @see R1     // Return type defined, 1  param. Only runtime exception allowed to be thrown.
 * @see R1E    // Return type defined, 1  param. You can define exception type to be thrown.
 * @see R2     // .                                -- "" --
 * @see R2E    //                                  -- "" --
 * @see R3     //                                  -- "" --
 * @see R3E    //                                  -- "" --
 * @see R4     //                                  -- "" --
 * @see R4E    //                                  -- "" --
 * @see R5     //                                  -- "" --
 * @see R5E    //                                  -- "" --
 *
 * Returning lambads with varargs parameters
 * @see RP     // Return type defined           , unlimited params of 1 defined type. Only runtime exception allowed to be thrown.
 * @see RPE    // Return type defined           , unlimited params of 1 defined type. You can define exception type to be thrown.
 * @see RO     // Return type defined           , unlimited params of Object type   . Only runtime exception allowed to be thrown.
 * @see ROE    // Return type defined           , unlimited params of Object type   . You can define exception type to be thrown.
 * @see OO     // Return type undefined (Object), unlimited params of Object type   . Only runtime exception allowed to be thrown.
 * @see OOE    // Return type undefined (Object), unlimited params of Object type   . You can define exception type to be thrown.
 *
 * Void based lambdas with zero to 5 parameters
 * @see V      // Void lambda, can not return, 0 params. Only runtime exception allowed to be thrown.
 * @see VE     // Void lambda, can not return, 0 params. You can define exception type to be thrown.
 * @see V1     // Void lambda, can not return, 1  param. Only runtime exception allowed to be thrown
 * @see V1E    // Void lambda, can not return, 1  param. You can define exception type to be thrown.
 * @see V2     // .                                -- "" --
 * @see V2E    //                                  -- "" --
 * @see V3     //                                  -- "" --
 * @see V3E    //                                  -- "" --
 * @see V4     //                                  -- "" --
 * @see V4E    //                                  -- "" --
 * @see V5     //                                  -- "" --
 * @see V5E    //                                  -- "" --
 *
 * Varargs void version with defined parameters, and (VO, VOE) object only parameters
 * @see VP     // Void lambda, can not return, unlimited params of 1 defined type. Only runtime exception allowed to be thrown.
 * @see VPE    // Void lambda, can not return, unlimited params of 1 defined type. You can define exception type to be thrown.
 * @see VO     // Void lambda, can not return, unlimited params of Object type   . Only runtime exception allowed to be thrown.
 * @see VOE    // Void lambda, can not return, unlimited params of Object type   . You can define exception type to be thrown.
 *
 * Those that ends with E supports throwing of 1 defined exception type.
 *
 * In the future, we might consider adding R1E2, R1E3, ... to allow the throwing of multiple exception types rather than having to throw a bigger exception type as of now.
 *
 * @since 1.8
 *
 * @author Joseph S.
 **/
public final class Closure extends Lambda {
    Closure(){ /* should remain package local / private to avoid code completion on new */ }
}
