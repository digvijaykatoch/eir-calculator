/*
 * EIR Calculator 
 * Copyright (c) 2012 Sigit Dewanto, http://seagatesoft.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions: The above copyright
 * notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.seagatesoft.math;

/**
 * A representation of an univariate function.
 *  
 * @author Sigit Dewanto
 *
 */
public interface UnivariateFunction
{
	/**
	 * Returns the derivative function of this function.
	 * 
	 * @return the derivative function of this function.
	 */
	public UnivariateFunction getDerivativeFunction();
	
	/**
	 * Returns the value of this function given <tt>input</tt> as its argument.
	 * 
	 * @param input function's argument.
	 * @return the value of this function given <tt>input</tt> as its argument.
	 */
	public double getValue(double input);
}