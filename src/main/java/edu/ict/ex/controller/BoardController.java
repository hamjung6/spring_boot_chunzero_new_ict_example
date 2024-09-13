package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.BoardService;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/list")
	public String list(Model model) {

		log.info("list()..");

		model.addAttribute("boards", boardService.getList());

		return "board/list";
	}

	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view()..");

		model.addAttribute("content_view", boardService.get(boardVO.getBid()));

		return "board/content_view";
	}

	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete()..");

		int bid = boardVO.getBid();
		boardService.remove(bid);

		return "redirect:/board/list";
	}
	
	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view()..");

		return "board/write_view";
	}

	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify()..");

		boardService.modify(boardVO.getBid(),boardVO.getBname(), boardVO.getBtitle(), boardVO.getBcontent());

		return "redirect:/board/list";
	}

	@GetMapping("/reply_view")
	   public String reply_view(BoardVO boardVO,Model model) {
	      log.info("reply_view().. ");

	      model.addAttribute("reply_view", boardService.get(boardVO.getBid()) );      
	      
	      return "/board/reply_view";
	   }

	
	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {
		log.info("reply()..");

		boardService.writeReply(boardVO);

		return "redirect:/board/list2";
	}
	
	@GetMapping("/list2")
	public String list2(Criteria criteria, Model model) {
		log.info("list2()..");

		model.addAttribute("boards", boardService.getListWithPaging(criteria));
		int total = boardService.getTotal();
		model.addAttribute("pageMaker", new PageVO(criteria, total));
		
		return "board/list2";
	}
}
