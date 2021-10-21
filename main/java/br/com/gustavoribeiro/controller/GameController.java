package br.com.gustavoribeiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gustavoribeiro.model.Game;
import br.com.gustavoribeiro.service.GameService;

@Controller
@RequestMapping("/books")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/forminsert")
    public String insert(Model model) {
        Game game = new Game();
        model.addAttribute("game", game);
        return "games/insert";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Game> games = gameService.findAll();
        model.addAttribute("games", games);
        return "games/list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute("game") Game game) {
        Game resultGame= gameService.insert(game);
        if (resultGame != null) {
            return "games/success";
        }
        return "games/error";
    }
}
