package com.proyecto.Message;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/contact")
    public String getContact(Model model) {
        model.addAttribute("url", "contact");
        model.addAttribute("titulo", "Contacto");
        model.addAttribute("link", "/contact");
        model.addAttribute("message", new Message());
        return "contact";
    }

    @GetMapping("/messsageList")
    public String mess(Model model) {
        List<Message> listMessages = messageRepository.findAll();
        model.addAttribute("listMessages", listMessages);
        return "consultas";
    }

    @PostMapping("/process_message")
    public String processMessage(Message message, BindingResult result, RedirectAttributes redirectAttributes) {
        messageRepository.save(message);
        redirectAttributes.addFlashAttribute("message1", "Failed");
        redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        if (result.hasErrors()) {
            return "redirect:/suggest-event";
        }
        redirectAttributes.addFlashAttribute("message1", "Success");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "redirect:/contact";
    }

    @GetMapping("/deleteMessage/{id}")
    public String eliminarProducto(@PathVariable("id") Integer id) {

        Message mess = messageRepository.findById1(id);
        messageRepository.delete(mess);

        return "redirect:/messsageList";
    }
}
//    @PostMapping("/process_message")
//    public String processMessage(Message message) {
//        messageRepository.save(message);
//        return "contact";
//    }
