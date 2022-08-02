package com.example.demo.controller;

import com.example.demo.dto.cart.CartDto;
import com.example.demo.entity.cart.CartItem;
import com.example.demo.service.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/mypage")
@RestController
@RequiredArgsConstructor
public class MyPageController {

    private final CartService cartService;

    //장바구니 가져오기
    @GetMapping("/cart")
    public List<CartItem> getCartItemList(@RequestBody CartDto cartDto){
        return cartService.getCartItemList(cartDto);
    }

    //장바구니 담기
    @PostMapping("/cart/add")
    public ResponseEntity addCart(@RequestBody CartDto cartDto){
        cartService.addCart(cartDto);

        return new ResponseEntity("장바구니에 추가 됐습니다~", HttpStatus.OK);
    }

    //장바구니 수정
    @PutMapping("/cart/update")
    public ResponseEntity updateCart(@RequestBody CartDto cartDto){
        cartService.updateCart(cartDto);

        return new ResponseEntity("장바구니 갯수 수정~~", HttpStatus.OK);
    }

    //장바구니 삭제
    @DeleteMapping("/cart/delete")
    public ResponseEntity deleteCartItem(@RequestBody CartDto cartDto){
        cartService.deleteCart(cartDto);
        return new ResponseEntity("아이템 삭제~", HttpStatus.OK);
    }

}
