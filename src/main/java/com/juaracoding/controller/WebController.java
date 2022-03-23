package com.juaracoding.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juaracoding.model.ContentModel;
import com.juaracoding.model.JudulModel;
import com.juaracoding.model.TestiModel;
import com.juaracoding.model.UserModel;

@Controller
public class WebController {
	String judul1 = "Anu";
	String judul2 = "An";
	
	TestiModel testi = new TestiModel(
			"Banci Sukses", "PT Banci Sejahtera", "Tessy Wahyuni", "/img/athena.png");
	JudulModel judul = new JudulModel("Anu", "An");
	
	List<ContentModel> listContent = new ArrayList<ContentModel>();

	
	
	@GetMapping("/")
	private String index(Model model){
		
//		Array
		ContentModel model1 = new ContentModel("Judul ini asik", "Sangat amat dan paling paling paling asiik");
		listContent.add(model1);
		ContentModel model2 = new ContentModel("Judul kurang asik", "Sangat amat dan paling paling paling kurang asiik");
		listContent.add(model2);
		ContentModel model3 = new ContentModel("Judul tidak asik", "Sangat amat dan paling paling paling tidak asiik");
		listContent.add(model3);
		model.addAttribute("listContent", listContent);
	
		
		
		model.addAttribute("testi", testi);
		model.addAttribute("judul", judul);
		model.addAttribute("deskripsi1", "Athena");
		model.addAttribute("deskripsi2","dewi kebijaksanaan,perang dan kerajinan tangan");
		model.addAttribute("gambarathena", "/img/athena.png");
		model.addAttribute("gambarzeus", "/img/prometheus.png");
		model.addAttribute("ceo", "CEO Olimpus");
		model.addAttribute("juduldeskripsi", "Mitologi Yunani");
		model.addAttribute("isideskripsi", "Sekumpulan Mitos dan Legenda yang berasal dari Yunani Kuno dan berisi kisah-kisah mengenai Dewa dan"
				+ " Pahlawan, sifat dunia, dan asal usul serta makna dari praktik ritual dan kultus orang Yunani Kuno.");
		model.addAttribute("button", "klik disini");
		
		return "index";
	}
	
	
	@GetMapping("/about")
	private String about(Model model) {
		model.addAttribute("testi", testi);
		model.addAttribute("judul", judul);
//		model.addAttribute("judul", judul1);
//		model.addAttribute("judul2", judul2);
		return "about";
	}
	
	@GetMapping("/services")
	private String service(Model model) {
		model.addAttribute("judul", judul);
//		model.addAttribute("judul1", judul1);
//		model.addAttribute("judul2", judul2);
		return "services";
	}
	
	@GetMapping("/blog")
	private String blog(Model model) {
		List<UserModel> listUser = new ArrayList<UserModel>();
		model.addAttribute("judul", judul);
//		model.addAttribute("judul1", judul1);
//		model.addAttribute("judul2", judul2);
		UserModel user1 = new UserModel("Adipati Kurniawan", "img/zeus.png", "Ada apa dengan tikungan 13 Mandalika?", "Bayak yang bilang bahwa tikungan 13 angker, Ih serem!");
		listUser.add(user1);
		UserModel user2 = new UserModel("Adipati Kurniawan", "img/zeus.png", "Ada apa dengan tikungan 13 Mandalika?", "Bayak yang bilang bahwa tikungan 13 angker, Ih serem!");
		listUser.add(user2);
		UserModel user3 = new UserModel("Adipati Kurniawan", "img/zeus.png", "Ada apa dengan tikungan 13 Mandalika?", "Bayak yang bilang bahwa tikungan 13 angker, Ih serem!");
		listUser.add(user3);
		
		model.addAttribute("listUser", listUser);
		return "blog";
	}
	
	@GetMapping("/blogsingle")
	private String blogsingle(Model model) {
		model.addAttribute("judul", judul);
//		model.addAttribute("judul1", judul1);
//		model.addAttribute("judul2", judul2);
		return "blog-single";
	}
	
	@GetMapping("/contact")
	private String contact(Model model) {
		model.addAttribute("judul", judul);
//		model.addAttribute("judul1", judul1);
//		model.addAttribute("judul2", judul2);
		return "contact";
	}
	
	

}
