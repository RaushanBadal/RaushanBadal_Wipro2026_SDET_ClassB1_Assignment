package Day26_DDT;
import org.testng.annotations.Test;

public class SmokeRegressionTes{

    // Smoke Test 1
    @Test(groups = {"smoke"})
    public void smokeTest1() {

        System.out.println("Smoke Test 1 Executed");
    }

    // Smoke Test 2
    @Test(groups = {"smoke"})
    public void smokeTest2() {

        System.out.println("Smoke Test 2 Executed");
    }

    // Regression Test 1
    @Test(groups = {"regression"})
    public void regressionTest1() {

        System.out.println("Regression Test 1 Executed");
    }

    // Regression Test 2
    @Test(groups = {"regression"})
    public void regressionTest2() {

        System.out.println("Regression Test 2 Executed");
    }
}
