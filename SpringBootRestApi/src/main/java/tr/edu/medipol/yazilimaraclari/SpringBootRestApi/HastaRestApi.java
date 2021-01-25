package tr.edu.medipol.yazilimaraclari.SpringBootRestApi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/hasta*")

public class HastaRestApi {
	public static List<String> hastalar= new ArrayList<>();
	@GetMapping("/listele")
	@ResponseBody
	public List<String> Listele() {
		return hastalar;
	}
	@PostMapping("/ekle")
	public String ekle(@RequestBody String ad) {
		hastalar.add(ad);
		return ad;
		
	}
	@DeleteMapping("/sil")
	public String sil(@RequestBody String ad) {
		hastalar.remove(ad);
		return ad;
	}
}