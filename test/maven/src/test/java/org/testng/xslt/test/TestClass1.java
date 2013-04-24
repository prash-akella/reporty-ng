package org.reportyng.xslt.test;

import org.reportyng.Reporter;
import org.reportyng.annotations.Test;

/**
 * @author Cosmin Marginean, Apr 1, 2008
 */
public class TestClass1 {

    @Test
    public void doSomething1() {
        Reporter.log("doSomething1");
    }

    @Test
    public void doSomething2() {
        Reporter.log("doSomething2");
    }

    @Test
    public void doSomething3() {
        throw new RuntimeException("Some error occurred");
    }
}
