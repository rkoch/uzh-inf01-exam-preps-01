/*
 * The MIT License (MIT)
 * Copyright © 2012 Remo Koch, http://rko.mit-license.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the “Software”), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.rko.uzh.exprep01.facade.cli;

import io.rko.uzh.exprep01.base.IContractOperations;
import io.rko.uzh.exprep01.model.Apprentice;
import io.rko.uzh.exprep01.model.Boss;
import io.rko.uzh.exprep01.model.LowerEmployee;
import io.rko.uzh.exprep01.model.Worker;
import io.rko.uzh.exprep01.version.PackageVersion;


public class TestDriver {

    public static void main(String[] pArgs) {
        System.out.println(String.format("%s started successfully.", PackageVersion.getPackageVersion()));
        System.out.println();

        Boss tony = new Boss("Tony Stark");

        LowerEmployee pepper = new Worker("Pepper Potts");
        IContractOperations jarvis = new Worker("Jarvis (Robot)");
        IContractOperations rhodes = new Apprentice("James Rhodes");

        // Hire all employees
        tony.hireFutureEmployee(pepper);
        tony.hireFutureEmployee(jarvis);
        tony.hireFutureEmployee(rhodes);

        System.out.println();

        tony.hireFutureEmployee(jarvis); // Wants to hire jarvis a second time (shouldn't work)

        System.out.println();

        tony.fireCurrentEmployee(rhodes); // Tony is now mad at Rhodes for stealing his iron man suit
        tony.fireCurrentEmployee(rhodes); // He is so mad that he tries to fire him again! (shouldn't work)

        System.out.println();

        tony.fireCurrentEmployee(pepper); // Now he's gotten crazy as f*ck :D

        System.out.println();
        System.out.println("All done, shutting down. - Stark Enterprise does not function without pepper...... x.x");
        System.exit(0);
    }

}
