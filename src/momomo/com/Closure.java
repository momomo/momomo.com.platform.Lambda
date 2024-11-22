/**************************************************************************************************************************Momomo Restrictive License 9 'MoL9' (https://raw.githubusercontent.com/momomo/momomo.com.yz.licenses/HEAD/MoL9)                       
                 
                 Momomo Restrictive License 9 'MoL9' (https://raw.githubusercontent.com/momomo/momomo.com.yz.licenses/HEAD/MoL9)                       
                                                    Copyrightⓒ 2014-2022, Momomo LTD 
                                                           All rights reserved
    (0) Definitions
    
        "This License" refers to the current version of Momomo Opensource Licence 'MoL9'.
        
        "Copyright" also means copyright-like laws that apply to other kinds of works, such as semiconductor masks.
                
        "Program" refers to any copyrightable work licensed under this License. Each Licensee is addressed as "you".  
        
        "Licensees" and "recipients" may be individuals or organizations.
                
        To "modify" a work means to copy from or adapt all or part of the work in a fashion requiring copyright permission other than the making of an exact copy. 
        
        The resulting work is called a "modified version" of the earlier work or a work "based on" the earlier work.
                
        A "covered work" means either the unmodified Program or a work based on the Program.
        
        To "propagate" a work means to do anything with it that, without permission, would make you directly or secondarily liable for infringement under applicable copyright law, except executing it on a computer. 
        
        Propagation includes copying, distribution (with or without modification), making available to the public, and in some country’s other activities as well.
                
        To "convey" a work means any kind of propagation that enables other parties to make or receive copies. Mere interaction with a user through a computer network, with no transfer of a copy, is not conveying.
        
        An interactive user interface displays "Appropriate Legal Notices" to the extent that it includes a convenient and prominently visible feature that 
            (a) displays an appropriate copyright notice, and 
            (b) tells the user that there is no warranty for the work (except to the extent that warranties are provided), that Licensees may convey the work under this License, and how to view a copy of this License. If the interface presents a list of user commands or options, such as a menu, a prominent item in the list meets this criterion.  
                                      
    (0) Software under this licence are subject to the following TERMS AND CONDITIONS listed clauses (1) - (6). 
    
    (1) Use of this source code, wether identical, changed, altered, compiled and/or compressed is only allowed for non-commercial use provided that all other conditions in this License are also met.                 
                                                                                                                                        
    (2) This source code may not be changed, altered, compiled and/or compressed unless a written consent has been requested and recieved by properly authorized representative of Momomo LTD.                                                                                        
                                                                                                                                        
    (3) The distribution and/or redistribution and/or publication of this source code, unchanged, changed, altered, compiled and/or compressed is prohibited to any medium, publicly, locally, privately and/or internally, unless a written consent has been requested and recieved by properly authorized representative of Momomo LTD.                                                                                                  
                                                                                                                                        
    (4) The use of and/or distribution of any work derived through the use of this source code, wether identical, changed, altered, compiled and/or compressed is prohibited, unless a written consent has been requested and recieved by properly authorized representative of Momomo LTD.                                                         
                                                                                                                                        
    (5) Momomo LTD considers the techniques, design patterns, naming, naming conventions, naming combinations, used and/or employed in the source as unique, copyright protected where the distribution and/or redistribution of this source code using altered names and/or rearranging and/or restructuring of this source as a severe breach of this License and/or relevant domestic and/or international copyright laws. 
                                                                                                                                        
    (6) All copies of this source code, wether identical, changed, altered, compiled and/or compressed must include this License in its entirety, list all changes made including the name and date of the entity/organization that introduced them, as well as the following disclaimer:          
        
        THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
                                                                                                                                        
    Please feel free to contact us on hello{at}momomo.com if you have any inquiries.   
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
 * There is no consequence in using eiter and both can be used and mixed together due to this being empty kropp classes that can not be overriden, while at the same time exposing the contained interfaces in Lambda.java
 *
 * Default methods with '@final' comments are to be considered final and should not be overriden.
 *
 * Returning lambdas with zero to 5 parameters.
 * @see Lambda.R      // Return type defined, 0 params. Only runtime exception allowed to be thrown.
 * @see Lambda.RE     // Return type defined, 0 params. You can define exception type to be thrown.
 * @see Lambda.R1     // Return type defined, 1  param. Only runtime exception allowed to be thrown.
 * @see Lambda.R1E    // Return type defined, 1  param. You can define exception type to be thrown.
 * @see Lambda.R2     // .                                -- "" --
 * @see Lambda.R2E    //                                  -- "" --
 * @see Lambda.R3     //                                  -- "" --
 * @see Lambda.R3E    //                                  -- "" --
 * @see Lambda.R4     //                                  -- "" --
 * @see Lambda.R4E    //                                  -- "" --
 * @see Lambda.R5     //                                  -- "" --
 * @see Lambda.R5E    //                                  -- "" --
 *
 * Returning lambads with varargs parameters
 * @see Lambda.RP     // Return type defined           , unlimited params of 1 defined type. Only runtime exception allowed to be thrown.
 * @see Lambda.RPE    // Return type defined           , unlimited params of 1 defined type. You can define exception type to be thrown.
 * @see Lambda.RO     // Return type defined           , unlimited params of Object type   . Only runtime exception allowed to be thrown.
 * @see Lambda.ROE    // Return type defined           , unlimited params of Object type   . You can define exception type to be thrown.
 * @see Lambda.OO     // Return type undefined (Object), unlimited params of Object type   . Only runtime exception allowed to be thrown.
 * @see Lambda.OOE    // Return type undefined (Object), unlimited params of Object type   . You can define exception type to be thrown.
 *
 * Void based lambdas with zero to 5 parameters
 * @see Lambda.V      // Void lambda, can not return, 0 params. Only runtime exception allowed to be thrown.
 * @see Lambda.VE     // Void lambda, can not return, 0 params. You can define exception type to be thrown.
 * @see Lambda.V1     // Void lambda, can not return, 1  param. Only runtime exception allowed to be thrown
 * @see Lambda.V1E    // Void lambda, can not return, 1  param. You can define exception type to be thrown.
 * @see Lambda.V2     // .                                -- "" --
 * @see Lambda.V2E    //                                  -- "" --
 * @see Lambda.V3     //                                  -- "" --
 * @see Lambda.V3E    //                                  -- "" --
 * @see Lambda.V4     //                                  -- "" --
 * @see Lambda.V4E    //                                  -- "" --
 * @see Lambda.V5     //                                  -- "" --
 * @see Lambda.V5E    //                                  -- "" --
 *
 * Varargs void version with defined parameters, and (VO, VOE) object only parameters
 * @see Lambda.VP     // Void lambda, can not return, unlimited params of 1 defined type. Only runtime exception allowed to be thrown.
 * @see Lambda.VPE    // Void lambda, can not return, unlimited params of 1 defined type. You can define exception type to be thrown.
 * @see Lambda.VO     // Void lambda, can not return, unlimited params of Object type   . Only runtime exception allowed to be thrown.
 * @see Lambda.VOE    // Void lambda, can not return, unlimited params of Object type   . You can define exception type to be thrown.
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
