package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightMixTest {
    LightMix pasoProceso;
    MockMixingTank tanque;
    I2CDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        this.tanque = new MockMixingTank(50, 20);
        this.pasoProceso = new LightMix();
        this.driver = new I2CDriver(100, 2000, this.tanque, this.pasoProceso);
    }

    @Test
    void TestStartSequence(){
        driver.sendStartSeq();

        Assertions.assertEquals(20, tanque.getHeatPower());
        Assertions.assertEquals(5, tanque.getMixerPower());
        Assertions.assertEquals(50, tanque.upTo());
    }

    @Test
    void TestStopSequence(){
        driver.sendStartSeq();
        driver.sendStopSeq();

        Assertions.assertTrue(pasoProceso.isDone());
    }
}
