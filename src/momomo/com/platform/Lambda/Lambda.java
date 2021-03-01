/***************************************************************************************************************************************
    Copyright(C) 2020, Momomo LTD. All rights reserved. Momomo LTD Opensource License 'MoL1'.

    (1) Use of this source code, wether identical, changed or altered is allowed, for commercial and non-commercial use.

    (2) This source code may be changed and altered freely to be used only within your entity/organisation, given that a notice of all
        changes introduced must listed and included at the end of an exact copy of this notice, including the date and name of the
        entity/organization that introduced them.

    (3) The redistribution and/or publication of this source code to the public, if changed or altered, is prohibited using any
        medium not priorly approved by Momomo LTD unless a written consent has been requested and recieved by
        representatives of Momomo LTD.

    (4) The distribution of any work to the derived through the use of this source code, wether identical, changed or altered,
        is however allowed, as long as such distribution does not contradict (3).

    (5). Momomo LTD considers the techniques, design patterns, the naming, naming combinations, used and employed in the source as
         unique and copyright protected where the redistribution of this source code using altered names, and/or rearranging and/or
         restructuring of this source as a severe breach of the copyright law and this license. Momomo LTD reserves all rights to
         puruse any and all legal options.

    (6) All copies of this source code, wether identical, changed/altered must include this entire copyright notice, list all changes
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

    Please contact us on opensource{at}momomo.com if you have an improvement to this source code you'd like to contribute in any way.
**************************************************************************************************************************************/
package momomo.com.platform.Lambda;

import java.util.function.*;

/**
 * @author Mo. Joseph
 *
 * @since 1.8
 */
public abstract class Lambda {
        Lambda(){ /* should remain package local / private to avoid code completion on new */ }

        /** R = R0 = Return of defined type with 0 parameters */
        @FunctionalInterface public interface R<Returns> extends RE<Returns, RuntimeException>, Supplier<Returns> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1> R1<Returns, Param1> R1(){
                        return (param1) -> {
                                return call();
                        };
                }

                /**
                 * Secondary returning conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2> R2<Returns, Param1, Param2> R2() {
                        return (param1, param2) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
                        return (param1, param2, param3) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call();
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V V(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1> V1<Param1> V1() {
                        return (param1) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2> V2<Param1, Param2> V2() {
                        return (param1, param2) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3> V3<Param1, Param2, Param3> V3() {
                        return (param1, param2, param3) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call();
                        };
                }

                // ----------
                // ----------
                // ----------

                @Override /* final */ default Returns get() {
                        return call();
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** RE  = Return of defined type with 0 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface RE<Returns, E extends Throwable> {
                Returns call() throws E;

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1> R1E<Returns, Param1, E> R1E(){
                        return (param1) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2> R2E<Returns, Param1, Param2, E> R2E(){
                        return (param1, param2) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
                        return (param1, param2, param3) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                return call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call();
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default VE<E> VE(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1> V1E<Param1, E> V1E() {
                        return (param1) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2> V2E<Param1, Param2, E> V2E() {
                        return (param1, param2) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
                        return (param1, param2, param3) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
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

        /** R1  = Return of defined type with 1 defined parameters */
        @FunctionalInterface public interface R1<Returns, Param1> extends R1E<Returns, Param1, RuntimeException>, Function<Param1, Returns> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2> R2<Returns, Param1, Param2> R2(){
                        return (param1, param2) -> {
                                return call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
                        return (param1, param2, param3) -> {
                                return call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                return call(param1);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1);
                        };
                }

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V1<Param1> V1(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2> V2<Param1, Param2> V2() {
                        return (param1, param2) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3> V3<Param1, Param2, Param3> V3() {
                        return (param1, param2, param3) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1);
                        };
                }

                // ----------
                // ----------
                // ----------

                @Override /* final */ default Returns apply(Param1 param1) {
                        return call(param1);
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** R1E = Return of defined type with 1 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface R1E<Returns, Param1, E extends Throwable> {
                public Returns call(Param1 param1) throws E;

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2> R2E<Returns, Param1, Param2, E> R2E(){
                        return (param1, param2) -> {
                                return call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
                        return (param1, param2, param3) -> {
                                return call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                return call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V1E<Param1, E> V1E(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2> V2E<Param1, Param2, E> V2E() {
                        return (param1, param2) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
                        return (param1, param2, param3) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
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

        /** R2  = Return of defined type with 2 defined parameters */
        @FunctionalInterface public interface R2<Returns, Param1, Param2> extends R2E<Returns, Param1, Param2, RuntimeException>, BiFunction<Param1, Param2, Returns> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3> R3<Returns, Param1, Param2, Param3> R3(){
                        return (param1, param2, param3) -> {
                                return call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                return call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1, param2);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V2<Param1, Param2> V2(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param3> V3<Param1, Param2, Param3> V3() {
                        return (param1, param2, param3) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2);
                        };
                }

                // ----------
                // ----------
                // ----------

                @Override /* final */ default Returns apply(Param1 param1, Param2 param2) {
                        return call(param1, param2);
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** R2E = Return of defined type with 2 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface R2E<Returns, Param1, Param2, E extends Throwable> {
                Returns call(Param1 param1, Param2 param2) throws E;

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3> R3E<Returns, Param1, Param2, Param3, E> R3E(){
                        return (param1, param2, param3) -> {
                                return call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                return call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1, param2);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V2E<Param1, Param2, E> V2E(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param3> V3E<Param1, Param2, Param3, E> V3E() {
                        return (param1, param2, param3) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
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

        /** R3  = Return of defined type with 3 defined parameters */
        @FunctionalInterface public interface R3<Returns, Param1, Param2, Param3> extends R3E<Returns, Param1, Param2, Param3, RuntimeException> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4> R4<Returns, Param1, Param2, Param3, Param4> R4(){
                        return (param1, param2, param3, param4) -> {
                                return call(param1, param2, param3);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1, param2, param3);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V3<Param1, Param2, Param3> V3(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2, param3);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2, param3);
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** R3E = Return of defined type with 3 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface R3E<Returns, Param1, Param2, Param3, E extends Throwable> {
                Returns call(Param1 param1, Param2 param2, Param3 param3) throws E;

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                return call(param1, param2, param3);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1, param2, param3);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.Split.java
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V3E<Param1, Param2, Param3, E> V3E(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2, param3);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
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

        /** R4  = Return of defined type with 4 defined parameters */
        @FunctionalInterface public interface R4<Returns, Param1, Param2, Param3, Param4> extends R4E<Returns, Param1, Param2, Param3, Param4, RuntimeException> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1, param2, param3, param4);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V4<Param1, Param2, Param3, Param4> V4(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param5> V5<Param1, Param2, Param3, Param4, Param5> V5(){
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2, param3, param4);
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** R4E = Return of defined type with 4 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface R4E<Returns, Param1, Param2, Param3, Param4, E extends Throwable> {
                Returns call(Param1 param1, Param2 param2, Param3 param3, Param4 param4) throws E;

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E(){
                        return (param1, param2, param3, param4, param5) -> {
                                return call(param1, param2, param3, param4);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V4E<Param1, Param2, Param3, Param4, E> V4E(){
                        return this::call;
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value and ignoring using the extra parameters.
                 */
                /* final */ default <Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
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

        /** R5  = Return of defined type with 4 defined parameters */
        @FunctionalInterface public interface R5<Returns, Param1, Param2, Param3, Param4, Param5> extends R5E<Returns, Param1, Param2, Param3, Param4, Param5, RuntimeException> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V5<Param1, Param2, Param3, Param4, Param5> V5(){
                        return this::call;
                }
        }

        /** R5E = Return of defined type with 4 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface R5E<Returns, Param1, Param2, Param3, Param4, Param5, E extends Throwable> {
                Returns call(Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) throws E;
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default V5E<Param1, Param2, Param3, Param4, Param5,E> V5E(){
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

        /** RP  = Returns of defined type, and unlimited amount of defined parameters, all of the same specified type P */
        @FunctionalInterface public interface RP<Returns, P> extends RPE<Returns, P, RuntimeException> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default VP<P> VP(){
                        return this::call;
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** RPE  = Returns of defined type, and unlimited amount of defined parameters, all of the same specified type P that can throw a Throwable E */
        @FunctionalInterface public interface RPE<Returns, P, E extends Throwable> {
                Returns call(Params<P> params) throws E;

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default VPE<P, E> VPE(){
                        return this::call;
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Is ok to call, but should not be overriden.
                 * Override call(Params<P> params) instead.
                 */
                /* final */ default Returns call(P... params) throws E {
                        return this.call(new Params<P>(params) );
                }
        }


        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////

        /** RO = Returns defined type, and takes an unlimited amount of undefined parameters (type Object) */
        @FunctionalInterface public interface RO<Returns> extends ROE<Returns, RuntimeException>, RP<Returns, Object> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default VO VO(){
                        return this::call;
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** ROE = Returns defined type, and takes an unlimited amount of undefined parameters (type Object) that can throw a Throwable E */
        @FunctionalInterface public interface ROE<Returns, E extends Throwable> extends RPE<Returns, Object, E> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply ignoring the return value.
                 */
                /* final */ default VOE<E> VOE(){
                        return this::call;
                }
        }

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

        /** V   = V0 = Void that takes zero parameters */
        @FunctionalInterface public interface V extends VE<RuntimeException>, Runnable {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1> V1<Param1> V1() {
                        return (Param1 param1) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2> V2<Param1, Param2> V2() {
                        return (param1, param2) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3> V3<Param1, Param2, Param3> V3() {
                        return (param1, param2, param3) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call();
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R<Returns> R() {
                        return () -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1> R1<Returns, Param1> R1() {
                        return (param1) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2> R2<Returns, Param1, Param2> R2() {
                        return (param1, param2) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
                        return (param1, param2, param3) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(); return null;
                        };
                }

                // ----------
                // ----------
                // ----------

                @Override /* final */ default void run() {
                        call();
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** VE  = V0E = Void that takes zero parameters, and that can throw a Throwable E */
        @FunctionalInterface public interface VE<E extends Throwable> {
                void call() throws E;

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1> V1E<Param1, E> V1E() {
                        return p -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2> V2E<Param1, Param2, E> V2E() {
                        return (param1, param2) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
                        return (param1, param2, param3) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call();
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param1, Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                call();
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> RE<Returns, E> RE() {
                        return () -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1> R1E<Returns, Param1, E> R1E(){
                        return (param1) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2> R2E<Returns, Param1, Param2, E> R2E(){
                        return (param1, param2) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
                        return (param1, param2, param3) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                call(); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param1, Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
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

        /** V1  = Void with 1 defined parameters */
        @FunctionalInterface public interface V1<Param1> extends V1E<Param1, RuntimeException>, Consumer<Param1> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2> V2<Param1, Param2> V2() {
                        return (Param1 param1, Param2 param2) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3> V3<Param1, Param2, Param3> V3() {
                        return (param1, param2, param3) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R1<Returns, Param1> R1() {
                        return (Param1 param1) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2> R2<Returns, Param1, Param2> R2() {
                        return (param1, param2) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2, Param3> R3<Returns, Param1, Param2, Param3> R3() {
                        return (param1, param2, param3) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1); return null;
                        };
                }

                // ----------
                // ----------
                // ----------

                @Override /* final */ default void accept(Param1 param1) {
                        call(param1);
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** V1E = Void with 1 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface V1E<Param1, E extends Throwable> {
                void call(Param1 param1) throws E;

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2> V2E<Param1, Param2, E> V2E() {
                        return (Param1 param1, Param2 param2) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3> V3E<Param1, Param2, Param3, E> V3E() {
                        return (param1, param2, param3) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param2, Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R1E<Returns, Param1, E> R1E() {
                        return (Param1 param1) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2> R2E<Returns, Param1, Param2, E> R2E() {
                        return (param1, param2) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
                        return (param1, param2, param3) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param2, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
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

        /** V2  = Void with 2 defined parameters */
        @FunctionalInterface public interface V2<Param1, Param2> extends V2E<Param1, Param2, RuntimeException>, BiConsumer<Param1, Param2> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3> V3<Param1, Param2, Param3> V3() {
                        return (Param1 param1, Param2 param2, Param3 param3) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R2<Returns, Param1, Param2> R2() {
                        return (Param1 param1, Param2 param2) -> {
                                call(param1, param2); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param3> R3<Returns, Param1, Param2, Param3> R3() {
                        return (param1, param2, param3) -> {
                                call(param1, param2); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param3, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param3, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2); return null;
                        };
                }

                // ----------
                // ----------
                // ----------

                @Override /* final */ default void accept(Param1 param1, Param2 param2) {
                        call(param1, param2);
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** V2E = Void with 2 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface V2E<Param1, Param2, E extends Throwable> {
                void call(Param1 param1, Param2 param2) throws E;

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3> V3E<Param1, Param2, Param3, E> V3E() {
                        return (Param1 param1, Param2 param2, Param3 param3) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param3, Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R2E<Returns, Param1, Param2, E> R2E() {
                        return (Param1 param1, Param2 param2) -> {
                                call(param1, param2); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param3> R3E<Returns, Param1, Param2, Param3, E> R3E() {
                        return (param1, param2, param3) -> {
                                call(param1, param2); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param3, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param3, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
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

        /** V3  = Void with 3 defined parameters */
        @FunctionalInterface public interface V3<Param1, Param2, Param3> extends V3E<Param1, Param2, Param3, RuntimeException> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4> V4<Param1, Param2, Param3, Param4> V4() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                                call(param1, param2, param3);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4, Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2, param3);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R3<Returns, Param1, Param2, Param3> R3() {
                        return (Param1 param1, Param2 param2, Param3 param3) -> {
                                call(param1, param2, param3); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param4> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2, param3); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param4, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2, param3); return null;
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** V3E = Void with 3 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface V3E<Param1, Param2, Param3, E extends Throwable> {
                void call(Param1 param1, Param2 param2, Param3 param3) throws E;

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4> V4E<Param1, Param2, Param3, Param4, E> V4E() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                                call(param1, param2, param3);
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param4, Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
                        return (param1, param2, param3, param4, param5) -> {
                                call(param1, param2, param3);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R3E<Returns, Param1, Param2, Param3, E> R3E() {
                        return (Param1 param1, Param2 param2, Param3 param3) -> {
                                call(param1, param2, param3); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param4> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (param1, param2, param3, param4) -> {
                                call(param1, param2, param3); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param4, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
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

        /** V4  = Void with 4 defined parameters */
        @FunctionalInterface public interface V4<Param1, Param2, Param3, Param4> extends V4E<Param1, Param2, Param3, Param4, RuntimeException> {
                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param5> V5<Param1, Param2, Param3, Param4, Param5> V5() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                                call(param1, param2, param3, param4);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R4<Returns, Param1, Param2, Param3, Param4> R4() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                                call(param1, param2, param3, param4); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param5> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                                call(param1, param2, param3, param4); return null;
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** V4E = Void with 4 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface V4E<Param1, Param2, Param3, Param4, E extends Throwable> {
                void call(Param1 param1, Param2 param2, Param3 param3, Param4 param4) throws E;

                /**
                 * Main void conversion convenience method.
                 *
                 * Convert this lambda to one that expects more parameters by simply ignoring using the extra parameters.
                 */
                /* final */ default <Param5> V5E<Param1, Param2, Param3, Param4, Param5, E> V5E() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                                call(param1, param2, param3, param4);
                        };
                }

                // ----------
                // ----------
                // ----------

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R4E<Returns, Param1, Param2, Param3, Param4, E> R4E() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4) -> {
                                call(param1, param2, param3, param4); return null;
                        };
                }

                /**
                 * Secondary void conversion convenience method for direct conversion avoiding having to make multiple chained conversions from main convience method to another main convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null and ignoring using the extra parameters.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns, Param5> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
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

        /** V5  = Void with 5 defined parameters */
        @FunctionalInterface public interface V5<Param1, Param2, Param3, Param4, Param5> extends V5E<Param1, Param2, Param3, Param4, Param5, RuntimeException>{
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R5<Returns, Param1, Param2, Param3, Param4, Param5> R5() {
                        return (Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) -> {
                                call(param1, param2, param3, param4, param5); return null;
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** V5E = Void with 5 defined parameters that can throw a Throwable E */
        @FunctionalInterface public interface V5E<Param1, Param2, Param3, Param4, Param5, E extends Throwable> {
                void call(Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5) throws E;

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> R5E<Returns, Param1, Param2, Param3, Param4, Param5, E> R5E() {
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

        /** VP  = Void that takes an unlimited amount of defined parameters, all of the same specified type P */
        @FunctionalInterface public interface VP<Param> extends VPE<Param, RuntimeException> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> RP<Returns, Param> RP() {
                        return (Params<Param> params) -> {
                                call(params); return null;
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** VPE = Void that takes an unlimited amount of defined parameters, all of the same specified type P that can throw a Throwable E */
        @FunctionalInterface public interface VPE<Param, E extends Throwable> {
                void call(Params<Param> params) throws E;

                /**
                 * Is ok to call, but should not be overriden.
                 * Override call(Params<P> params) instead.
                 */
                /* final */ default void call(Param ... params) throws E {
                        call(new Params<Param>(params));
                }

                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> RPE<Returns, Param, E> RPE() {
                        return (Params<Param> params) -> {
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

        /** VO  = Void that takes an unlimited amount of undefined parameters (type Object) */
        @FunctionalInterface public interface VO extends VOE<RuntimeException>, VP<Object> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> RO<Returns> RO() {
                        return (Params<Object> params) -> {
                                call(params); return null;
                        };
                }
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /** VOE = Void that takes an unlimited amount of undefined parameters (type Object) and that can throw a Throwable E */
        @FunctionalInterface public interface VOE<E extends Throwable> extends VPE<Object, E> {
                /**
                 * Main returning conversion convenience method.
                 *
                 * Convert this lambda to a void equal by simply returning null.
                 *
                 * Do note. This is to be used if you intend to return null anyway, allowing for a quicker and less syntatically verbose conversion.
                 * Suitable for method overloading when you are building your own API for instance and want to delegate to a base method that maybe returns whateve the lambda returns, or false for some iterating base method and where a null value is acceptable and properly handled.
                 * If you are passing a void lambda to a method that expects the lambda to always return a value that can not be null, you should not be returning null in the first place, which is still possible, with or without the use of this conversion convience method.
                 */
                /* final */ default <Returns> ROE<Returns, E> ROE() {
                        return (Params<Object> params) -> {
                                call(params); return null;
                        };
                }
        }
    
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
        /**
         * @author Mo. Joseph
         *
         * @since 1.8
         */
        public static final class Params<Param> {
                private final Param[] params;
        
                Params(Param... params) {
                        this.params = params;
                }
        
                public Param at(int index) {
                        return params.length > index ? (Param) params[index] : null;
                }
        
                public int size() {
                        return params.length;
                }
        }
}
