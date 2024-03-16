package com.example.SpringModul3.service;

import com.example.SpringModul3.domain.Contact;
import com.example.SpringModul3.repository.ContactsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AppController {

    private final ContactsRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("contacts", repository.findAll());
        return "index";
    }

    @GetMapping("/contact/create")
    public String showCreateForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "create";
    }

    @PostMapping("/contact/create")
    public String createContact(@ModelAttribute Contact contact) {
        repository.save(contact);
        return "redirect:/";
    }

    @GetMapping("/contact/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Contact> contact = repository.findById(id);
        if (contact.isPresent()) {
            model.addAttribute("contact", contact.get());
            return "create";
        }
        return "redirect:/";
    }

    @PostMapping("/contact/edit")
    public String editContact(@ModelAttribute Contact contact) {
        repository.update(contact);
        return "redirect:/";
    }


    @GetMapping("/contact/delete/{id}")
    public String deleteContact(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}
