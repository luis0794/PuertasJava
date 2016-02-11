package logica;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class ControlGPIO {
	
	public void uno() throws InterruptedException
	{
		final GpioController gpio = GpioFactory.getInstance();
		final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21, "MyLED", PinState.HIGH);
		Thread.sleep(5000);
		
		/*pin.low();
		Thread.sleep(5000);
		pin.toggle();
		Thread.sleep(5000);
		pin.toggle();
		Thread.sleep(5000);*/
		
		pin.pulse(1000, true); 
		gpio.shutdown();

	}

}
