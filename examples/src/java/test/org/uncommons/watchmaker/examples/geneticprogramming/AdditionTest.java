// ============================================================================
//   Copyright 2006, 2007 Daniel W. Dyer
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================
package org.uncommons.watchmaker.examples.geneticprogramming;

import org.testng.annotations.Test;

/**
 * Simple unit test for the {@link Addition} node type.
 * @author Daniel Dyer
 */
public class AdditionTest
{
    @Test
    public void testEvaluation()
    {
        Node node = new Addition(new Constant(1), new Parameter(0));
        double value = node.evaluate(new double[]{3}); // 1 + 3
        assert value == 4 : "Wrong result: " + value;
    }

    @Test
    public void testStringRepresentation()
    {
        Node node = new Addition(new Constant(1), new Constant(3));
        assert node.print().equals("(1.0 + 3.0)") : "Wrong string representation: " + node.print();
    }
}