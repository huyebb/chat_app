// File: LoginSignup.js

import React, { useState } from "react";
import "../Auth//LoginForm.css";
const LoginSignup = () => {
  const [activeForm, setActiveForm] = useState("signup");

  return (
    <section className={`wrapper ${activeForm === "login" ? "active" : ""}`}>
      {/* Signup Form */}
      <div className={`form signup ${activeForm === "signup" ? "active" : ""}`}>
        <header onClick={() => setActiveForm("signup")}>Đăng ký</header>
        <form>
          <input type="text" placeholder="Full name" required />
          <input type="text" placeholder="Email address" required />
          <input type="password" placeholder="Password" required />
          <div className="checkbox">
            <input type="checkbox" id="signupCheck" />
            <label htmlFor="signupCheck">Tôi chấp nhận tất cả các điều khoản &� điều kiện</label>
          </div>
          <input type="submit" value="Đăng ký" />
        </form>
      </div>

      {/* Login Form */}
      <div className={`form login ${activeForm === "login" ? "active" : ""}`}>
        <header onClick={() => setActiveForm("login")}>Đăng Nhập</header>
        <form>
          <input type="text" placeholder="Email address" required />
          <input type="password" placeholder="Password" required />
          <a href="#">Quên mật khẩu?</a>
          <input type="submit" value="Đăng Nhập" />
        </form>
      </div>
    </section>
  );
};

export default LoginSignup;
