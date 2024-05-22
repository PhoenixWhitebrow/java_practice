package my.first.pak;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test
  public void testPrimes() {
    int n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
}
