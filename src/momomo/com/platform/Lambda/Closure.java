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

/**
 * @author Mo. Joseph
 *
 * In Intellij a more suitable name is 'Closure' because it allows for better code completion.
 *
 * 'Lambda' has proven annoying to code complete in Intellij, possibly due to other classes using the Lambda namespace, albeit not that many more than those using the Closure namespace.
 *
 * 'Closure' is often instantanous wheras Lambda will almost always cause a hickup and require manual selection for the import of library.
 * It might depend on your environment really, which is why we've included this extra namespace that we prefer to use in our own environment.
 *
 * There is no consequence in using eiter, and both can be used and mixed together due to both being empty skeleton classes that can not be implemented, while at the same time exposing the contained interfaces in Lambda.java
 *
 * @since 1.8
 * **/
public final class Closure extends Lambda {
        Closure(){ /* should remain package local / private to avoid code completion on new */ }
}
