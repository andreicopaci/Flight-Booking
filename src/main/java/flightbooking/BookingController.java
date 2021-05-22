package flightbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {
	FlightInfo flight;

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userInfo", new UserInfo());
		return "registration";
	}

	@GetMapping("/booking")
	public String booking(Model model) {
		model.addAttribute("flightInfo", new FlightInfo());
		return "booking";
	}

	@PostMapping("/user_info")
	public String submitForm(@ModelAttribute("user") UserInfo user) {
		return "register_succees";
	}

	@PostMapping("/flight_info")
	public String submitFlightForm(@ModelAttribute("flight") FlightInfo flight) {
		return "booking_succees";
	}
}