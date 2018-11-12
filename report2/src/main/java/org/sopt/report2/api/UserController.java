package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final static List<User> userList = new LinkedList<>();

    // 현재 시간 반환
    @GetMapping("/")
    public String getNowTime() {
        return new Date().toString();
    }

    // 2, 3, 4
    @GetMapping("/users")
    public List<String> getUserList(
            @RequestParam(value = "name") final Optional<String> name,
            @RequestParam(value = "part") final Optional<String> part) {

        List<String> users = new LinkedList<>();

        //현재 리스트에서 같은 이름의 회원이 있는지 검색,
        //있으면 회원 데이터 반환, 없으면 "없습니다" 반환
        if (name.isPresent()) {
            for (User u : userList) {
                if (u.getName().equals(name.get()))
                    users.add(u.toString());
            }
        }
        //현재 리스트에서 같은 파트의 회원이 있는지 검색
        //있으면 회원 데이터 반환, 없으면 "없습니다" 반환
        else if (part.isPresent()) {
            for (User u : userList) {
                if (u.getPart().equals(part.get()))
                    users.add(u.toString());
            }
        }
        //현재 리스트에 등록된 모든 회원 데이터 반환
        else {
            for (User u : userList)
                users.add(u.toString());
        }

        if (users.size() == 0)
            users.add("없습니다.");

        return users;
    }

    //현재 리스트에서 회원 id값으로 회원 검색,
    //있으면 회원 데이터 반환, 없으면 "없습니다" 반환
    @GetMapping("/users/{user_idx}")
    public String getUser(@PathVariable(value = "user_idx") final int user_idx) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx)
                return u.toString();
        }
        return "없습니다.";
    }

    //회원 저장
    @PostMapping("/users")
    public String saveUser(@RequestBody final User user) {
        userList.add(user);
        return "회원 저장 완료";
    }

    //회원 정보 수정
    @PutMapping("/users/{user_idx}")
    public String updateUser(@PathVariable(value = "user_idx") final int user_idx,
                             @RequestBody final User user) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                userList.remove(u);

                userList.add(user);
                return "회원 정보 수정 완료";
            }
        }
        return "회원 정보 수정 실패";
    }

    //회원 삭제
    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@PathVariable(value = "user_idx") final int user_idx) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                userList.remove(u);
                return "회원 삭제 완료";
            }
        }
        return "회원 삭제 실패";
    }

}
