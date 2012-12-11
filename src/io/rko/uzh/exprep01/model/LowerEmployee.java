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
package io.rko.uzh.exprep01.model;

import io.rko.uzh.exprep01.base.IContractOperations;


public abstract class LowerEmployee
        extends Employee
        implements IContractOperations {

    private boolean mHired;

    public LowerEmployee(String pName) {
        super(pName);
    }


    /**
     * @return int periodOfNotice in months
     */
    public abstract int getPeriodOfNotice();


    public boolean isHired() {
        return mHired;
    }


    @Override
    public void hire() {
        if (!mHired) {
            System.out.println(String.format("%s %s was hired.", getType().title(), getName()));
            mHired = true;
        } else {
            System.out.println(String.format("%s %s is already hired, you cannot hire him two times.", getType().title(), getName()));
        }
    }

    @Override
    public void fire() {
        if (mHired) {
            System.out.println(String.format("%s %s was fired with period of notice of %d month%s.",
                    getType().title(), getName(), getPeriodOfNotice(), (getPeriodOfNotice() == 1 ? "" : "s")));
            mHired = false;
        } else {
            System.out.println(String.format("%s %s is not hired, you cannot fire him.", getType().title(), getName()));
        }

    }


    @Override
    public String toString() {
        if (isHired()) {
            return new StringBuilder(super.toString()).append(" (is hired)").toString();
        }
        return super.toString();
    }

}
