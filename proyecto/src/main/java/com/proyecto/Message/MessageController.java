package com.proyecto.Message;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/process_message")
    public String processMessage(Message message) {
        messageRepository.save(message);
        return "contact";
    }

    @GetMapping("/messsageList")
    public String messages(Model model) {
        List<Message> listMessages = messageRepository.findAll();
        model.addAttribute("listMessages", listMessages);
        return "consultas";
    }
    
    
        @GetMapping("/deleteUsers/{usuario}")
    public String eliminarProducto(@PathVariable("message") String message) {
        
        Message mess = messageRepository.findByName(message);
        messageRepository.delete(mess);

        return "redirect:/users";
    }
    
    
}
