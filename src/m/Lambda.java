/*****************************************************************************************************************************************
                 
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
package m;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
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
 * In the future, we might consider adding R1E2, R1E3 ... to allow the throwing of multiple exception types rather than having to throw a bigger exception type as of now.
 *
 * @since 1.8
 *
 * @author Joseph S.
 */
public abstract class Lambda {
    Lambda(){ /* should remain package local / private to avoid code completion on new */ }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** R = R0 = Return of defined type with 0 parameters */
    @FunctionalInterface public interface R<Returns> extends RE<Returns, RuntimeException>, Supplier<Returns> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1> R1<Returns, Param1> R1(){
            return (param1) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2> R2<Returns, Param1, Param2> R2() {
            return (param1, param2) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
            return (param1, param2, param3) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                return call();
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V V(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1> V1<Param1> V1() {
            return (param1) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2> V2<Param1, Param2> V2() {
            return (param1, param2) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3> V3<Param1, Param2, Param3> V3() {
            return (param1, param2, param3) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call();
            };
        }
        
        // ---------- IMPLEMENTING SUPPLIER INTERFACE  ----------
        
        /* @final */ @Override default Returns get() {
            return call();
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** RE = ROE = Return of defined type with 0 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface RE<Returns, E extends Throwable> {
        Returns call() throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1> R1E<Returns, Param1, E> R1E(){
            return (param1) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2> R2E<Returns, Param1, Param2, E> R2E(){
            return (param1, param2) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
            return (param1, param2, param3) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                return call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                return call();
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default VE<E> VE(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1> V1E<Param1, E> V1E() {
            return (param1) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2> V2E<Param1, Param2, E> V2E() {
            return (param1, param2) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
            return (param1, param2, param3) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call();
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    
    /** R1  = Return of defined type with 1 defined parameters */
    @FunctionalInterface public interface R1<Returns, Param1> extends R1E<Returns, Param1, RuntimeException>, Function<Param1, Returns> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2> R2<Returns, Param1, Param2> R2(){
            return (param1, param2) -> {
                return call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
            return (param1, param2, param3) -> {
                return call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                return call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1);
            };
        }
    
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V1<Param1> V1(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2> V2<Param1, Param2> V2() {
            return (param1, param2) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2, Param3> V3<Param1, Param2, Param3> V3() {
            return (param1, param2, param3) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1);
            };
        }
        
        // ---------- IMPLEMENTING FUNCTION INTERFACE  ----------
        
        /* @final */ @Override default Returns apply(Param1 param1) {
            return call(param1);
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** R1E = Return of defined type with 1 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface R1E<Returns, Param1, E extends Throwable> {
        public Returns call(Param1 param1) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2> R2E<Returns, Param1, Param2, E> R2E(){
            return (param1, param2) -> {
                return call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
            return (param1, param2, param3) -> {
                return call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                return call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V1E<Param1, E> V1E(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2> V2E<Param1, Param2, E> V2E() {
            return (param1, param2) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
            return (param1, param2, param3) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1);
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** R2  = Return of defined type with 2 defined parameters */
    @FunctionalInterface public interface R2<Returns, Param1, Param2> extends R2E<Returns, Param1, Param2, RuntimeException>, BiFunction<Param1, Param2, Returns> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3> R3<Returns, Param1, Param2, Param3> R3(){
            return (param1, param2, param3) -> {
                return call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                return call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1, param2);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V2<Param1, Param2> V2(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param3> V3<Param1, Param2, Param3> V3() {
            return (param1, param2, param3) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2);
            };
        }
        
        // ---------- IMPLEMENTING BIFUNCTION INTERFACE  ----------
        
        /* @final */ @Override default Returns apply(Param1 param1, Param2 param2) {
            return call(param1, param2);
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** R2E = Return of defined type with 2 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface R2E<Returns, Param1, Param2, E extends Throwable> {
        Returns call(Param1 param1, Param2 param2) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3> R3E<Returns, Param1, Param2, Param3, E> R3E(){
            return (param1, param2, param3) -> {
                return call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                return call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1, param2);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V2E<Param1, Param2, E> V2E(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param3> V3E<Param1, Param2, Param3, E> V3E() {
            return (param1, param2, param3) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2);
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** R3  = Return of defined type with 3 defined parameters */
    @FunctionalInterface public interface R3<Returns, Param1, Param2, Param3> extends R3E<Returns, Param1, Param2, Param3, RuntimeException> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4> R4<Returns, Param1, Param2, Param3, Param4> R4(){
            return (param1, param2, param3, param4) -> {
                return call(param1, param2, param3);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1, param2, param3);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V3<Param1, Param2, Param3> V3(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2, param3);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3);
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** R3E = Return of defined type with 3 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface R3E<Returns, Param1, Param2, Param3, E extends Throwable> {
        Returns call(Param1 param1, Param2 param2, Param3 param3) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                return call(param1, param2, param3);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1, param2, param3);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Main void conversion convenience method.Split.java
         *
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V3E<Param1, Param2, Param3, E> V3E(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2, param3);
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3);
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** R4  = Return of defined type with 4 defined parameters */
    @FunctionalInterface public interface R4<Returns, Param1, Param2, Param3, Param4> extends R4E<Returns, Param1, Param2, Param3, Param4, RuntimeException> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                return call(param1, param2, param3, param4);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V4<Param1, Param2, Param3, Param4> V4(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param5> V5<Param1, Param2, Param3, Param4, Param5> V5(){
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3, param4);
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** R4E = Return of defined type with 4 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface R4E<Returns, Param1, Param2, Param3, Param4, E extends Throwable> {
        Returns call(Param1 param1, Param2 param2, Param3 param3, Param4 param4) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E(){
            return (param1, param2, param3, param4, param5) -> {
                return call(param1, param2, param3, param4);
            };
        }
        
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V4E<Param1, Param2, Param3, Param4, E> V4E(){
            return this::call;
        }
        
        /**
         * Convert this lambda to a void equivalent by not using the return value and not using the extra params.
        **/
        /* @final */ default <Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3, param4);
            };
        }
        
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** R5  = Return of defined type with 4 defined parameters */
    @FunctionalInterface public interface R5<Returns, Param1, Param2, Param3, Param4, Param5> extends R5E<Returns, Param1, Param2, Param3, Param4, Param5, RuntimeException> {
    
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V5<Param1, Param2, Param3, Param4, Param5> V5(){
            return this::call;
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** R5E = Return of defined type with 4 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface R5E<Returns, Param1, Param2, Param3, Param4, Param5, E extends Throwable> {
        Returns call(Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) throws E;
    
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default V5E<Param1, Param2, Param3, Param4, Param5,E> V5E(){
            return this::call;
        }
    }
    
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** RP  = Returns of defined type, and unlimited amount of defined parameters, all of the same specified type P */
    @FunctionalInterface public interface RP<Returns, P> extends RPE<Returns, P, RuntimeException> {
    
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default VP<P> VP(){
            return this::call;
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** RPE  = Returns of defined type, and unlimited amount of defined parameters, all of the same specified type P that can throw a Throwable E */
    @FunctionalInterface public interface RPE<Returns, P, E extends Throwable> {
        Returns call(Args<P> params) throws E;
    
        // ---------- VOID CONVERSION METHODS  ----------
        
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default VPE<P, E> VPE(){
            return this::call;
        }
        
        // ----------
        // ----------
        // ----------
        
        /**
         * Is ok to call, but should not be overriden.
         * Override call(Params<P> params) instead.
        **/
        /* @final */ default Returns call(P... params) throws E {
            return this.call(new Args<P>(params) );
        }
    }
    
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** RO = Returns defined type, and takes an unlimited amount of undefined parameters (type Object) */
    @FunctionalInterface public interface RO<Returns> extends ROE<Returns, RuntimeException>, RP<Returns, Object> {
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default VO VO(){
            return this::call;
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** ROE = Returns defined type, and takes an unlimited amount of undefined parameters (type Object) that can throw a Throwable E */
    @FunctionalInterface public interface ROE<Returns, E extends Throwable> extends RPE<Returns, Object, E> {
        /**
         * Convert this lambda to a void equivalent by not using the return value.
        **/
        /* @final */ default VOE<E> VOE(){
            return this::call;
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** OO = Returns undefined type Object, and takes an unlimited amount of undefined parameters (type Object) */
    @FunctionalInterface public interface OO extends OOE<RuntimeException>, RO<Object> {
    
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** OOE = Returns undefined type Object, and takes an unlimited amount of undefined parameters (type Object) that can throw a Throwable E */
    @FunctionalInterface public interface OOE<E extends Throwable> extends ROE<Object, E> {
    
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    // Voids are treated specially as well to cover the complete spectrum for static declaration and usage
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** V = V0 = Void that takes zero parameters */
    @FunctionalInterface public interface V extends VE<RuntimeException>, Runnable {
    
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1> V1<Param1> V1() {
            return (Param1 param1) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2> V2<Param1, Param2> V2() {
            return (param1, param2) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3> V3<Param1, Param2, Param3> V3() {
            return (param1, param2, param3) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call();
            };
        }
        
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R<Returns> R() {
            return () -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1> R1<Returns, Param1> R1() {
            return (param1) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2> R2<Returns, Param1, Param2> R2() {
            return (param1, param2) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
            return (param1, param2, param3) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                call(); return null;
            };
        }
        
        // ---------- IMPLEMENTING RUNNABLE INTERFACE  ----------
        
        /* @final */ @Override default void run() {
            call();
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** VE  = V0E = Void that takes zero parameters, and that can throw a Throwable E */
    @FunctionalInterface public interface VE<E extends Throwable> {
        void call() throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1> V1E<Param1, E> V1E() {
            return p -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2> V2E<Param1, Param2, E> V2E() {
            return (param1, param2) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
            return (param1, param2, param3) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call();
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param1, Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call();
            };
        }
        
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> RE<Returns, E> RE() {
            return () -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1> R1E<Returns, Param1, E> R1E(){
            return (param1) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2> R2E<Returns, Param1, Param2, E> R2E(){
            return (param1, param2) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
            return (param1, param2, param3) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                call(); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param1, Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** V1  = Void with 1 defined parameters */
    @FunctionalInterface public interface V1<Param1> extends V1E<Param1, RuntimeException>, Consumer<Param1> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2> V2<Param1, Param2> V2() {
            return (Param1 param1, Param2 param2) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3> V3<Param1, Param2, Param3> V3() {
            return (param1, param2, param3) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1);
            };
        }
        
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R1<Returns, Param1> R1() {
            return (Param1 param1) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2> R2<Returns, Param1, Param2> R2() {
            return (param1, param2) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
            return (param1, param2, param3) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1); return null;
            };
        }
        
        // ---------- IMPLEMENTING CONSUMER INTERFACE -----------
        
        /* @final */ @Override default void accept(Param1 param1) {
            call(param1);
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** V1E = Void with 1 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface V1E<Param1, E extends Throwable> {
        void call(Param1 param1) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2> V2E<Param1, Param2, E> V2E() {
            return (Param1 param1, Param2 param2) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
            return (param1, param2, param3) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call(param1);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1);
            };
        }
        
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R1E<Returns, Param1, E> R1E() {
            return (Param1 param1) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2> R2E<Returns, Param1, Param2, E> R2E() {
            return (param1, param2) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
            return (param1, param2, param3) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                call(param1); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** V2  = Void with 2 defined parameters */
    @FunctionalInterface public interface V2<Param1, Param2> extends V2E<Param1, Param2, RuntimeException>, BiConsumer<Param1, Param2> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3> V3<Param1, Param2, Param3> V3() {
            return (Param1 param1, Param2 param2, Param3 param3) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2);
            };
        }
        
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Do note. This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R2<Returns, Param1, Param2> R2() {
            return (Param1 param1, Param2 param2) -> {
                call(param1, param2); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param3> R3<Returns, Param1, Param2, Param3> R3() {
            return (param1, param2, param3) -> {
                call(param1, param2); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2); return null;
            };
        }
        
        // ---------- IMPLEMENTING BICONSUMER INTERFACE  ----------
        
        /* @final */ @Override default void accept(Param1 param1, Param2 param2) {
            call(param1, param2);
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** V2E = Void with 2 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface V2E<Param1, Param2, E extends Throwable> {
        void call(Param1 param1, Param2 param2) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3> V3E<Param1, Param2, Param3, E> V3E() {
            return (Param1 param1, Param2 param2, Param3 param3) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2);
            };
        }
    
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R2E<Returns, Param1, Param2, E> R2E() {
            return (Param1 param1, Param2 param2) -> {
                call(param1, param2); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
            return (param1, param2, param3) -> {
                call(param1, param2); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** V3  = Void with 3 defined parameters */
    @FunctionalInterface public interface V3<Param1, Param2, Param3> extends V3E<Param1, Param2, Param3, RuntimeException> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4> V4<Param1, Param2, Param3, Param4> V4() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                call(param1, param2, param3);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3);
            };
        }
    
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R3<Returns, Param1, Param2, Param3> R3() {
            return (Param1 param1, Param2 param2, Param3 param3) -> {
                call(param1, param2, param3); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2, param3); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3); return null;
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** V3E = Void with 3 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface V3E<Param1, Param2, Param3, E extends Throwable> {
        void call(Param1 param1, Param2 param2, Param3 param3) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                call(param1, param2, param3);
            };
        }
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3);
            };
        }
    
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R3E<Returns, Param1, Param2, Param3, E> R3E() {
            return (Param1 param1, Param2 param2, Param3 param3) -> {
                call(param1, param2, param3); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (param1, param2, param3, param4) -> {
                call(param1, param2, param3); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** V4  = Void with 4 defined parameters */
    @FunctionalInterface public interface V4<Param1, Param2, Param3, Param4> extends V4E<Param1, Param2, Param3, Param4, RuntimeException> {
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                call(param1, param2, param3, param4);
            };
        }
    
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R4<Returns, Param1, Param2, Param3, Param4> R4() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                call(param1, param2, param3, param4); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                call(param1, param2, param3, param4); return null;
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** V4E = Void with 4 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface V4E<Param1, Param2, Param3, Param4, E extends Throwable> {
        void call(Param1 param1, Param2 param2, Param3 param3, Param4 param4) throws E;
        
        /**
         * Convert this lambda to one that expects more parameters by not using the extra params.
        **/
        /* @final */ default <Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                call(param1, param2, param3, param4);
            };
        }
    
        // ---------- RETURNING CONVERSION METHODS -----------
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                call(param1, param2, param3, param4); return null;
            };
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null and not using the extra params.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (param1, param2, param3, param4, param5) -> {
                call(param1, param2, param3, param4); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** V5  = Void with 5 defined parameters */
    @FunctionalInterface public interface V5<Param1, Param2, Param3, Param4, Param5> extends V5E<Param1, Param2, Param3, Param4, Param5, RuntimeException>{
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                call(param1, param2, param3, param4, param5); return null;
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** V5E = Void with 5 defined parameters that can throw a Throwable E */
    @FunctionalInterface public interface V5E<Param1, Param2, Param3, Param4, Param5, E extends Throwable> {
        void call(Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) throws E;
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
            return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                call(param1, param2, param3, param4, param5); return null;
            };
        }
    }
    
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** VP  = Void that takes an unlimited amount of defined parameters, all of the same specified type P */
    @FunctionalInterface public interface VP<P> extends VPE<P, RuntimeException> {
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> RP<Returns, P> RP() {
            return (Args<P> params) -> {
                call(params); return null;
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** VPE = Void that takes an unlimited amount of defined parameters, all of the same specified type P that can throw a Throwable E */
    @FunctionalInterface public interface VPE<P, E extends Throwable> {
        void call(Args<P> params) throws E;
        
        /**
         * Is ok to call, but should not be overriden.
         * Override call(Params<P> params) instead.
        **/
        /* @final */ default void call(P... params) throws E {
            call(new Args<P>(params));
        }
        
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> RPE<Returns, P, E> RPE() {
            return (Args<P> params) -> {
                call(params); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /** VO  = Void that takes an unlimited amount of undefined parameters (type Object) */
    @FunctionalInterface public interface VO extends VOE<RuntimeException>, VP<Object> {
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> RO<Returns> RO() {
            return (Args<Object> params) -> {
                call(params); return null;
            };
        }
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // ~~~~~~~~~~~~ REPEAT WITH SUPPORT FOR EXCEPTION THROWING ~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /** VOE = Void that takes an unlimited amount of undefined parameters (type Object) and that can throw a Throwable E */
    @FunctionalInterface public interface VOE<E extends Throwable> extends VPE<Object, E> {
        /**
         * Convert this lambda to a void equivalent by returning null.
         *
         * Attention!
         *
         * This conversion method is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
         * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whatever the lambda.call(...) returns, where a null value is acceptable and properly handled.
         * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
        **/
        /* @final */ default <Returns> ROE<Returns, E> ROE() {
            return (Args<Object> params) -> {
                call(params); return null;
            };
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    /**
     * @author Joseph S.
     *
     * Convenience class when creating a lambda that takes varargs ...
     *
     * Allows for easier access and casting by index.
     *
     * @since 1.8
     */
    public static final class Args<P> {
        private final P[] args;
        
        Args(P... args) {
            this.args = args;
        }
        
        public P at(int index) {
            return args.length > index ? (P) args[index] : null;
        }
        
        public int size() {
            return args.length;
        }
    }
}
