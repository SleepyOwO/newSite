//package web.newsite.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import web.newsite.service.UserService;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//
//    @Autowired
//    private UserService userService;
//
//    private void configureAuthorization(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(rQ -> {
//                    // Доступ только для не зарегистрированных пользователей
//                    rQ.requestMatchers("/registration").anonymous()
//                            // Доступ только для пользователей с ролью Администратор
//                            .requestMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
//                            // Доступ только для пользователей с ролью Пользователь
//                            .requestMatchers("/news").hasAuthority("ROLE_USER")
//                            // Доступ разрешен всем пользователям
//                            .requestMatchers("/", "/resources/**").permitAll()// Все остальные страницы требуют аутентификации
//                            .anyRequest().authenticated();});
//    }
//
//    private void configureFormLogin(HttpSecurity http) throws Exception {
//        http.formLogin(Customizer.withDefaults())
//                .loginPage("/login")
//                // Переадресация на главную страницу после успешного входа
//                .defaultSuccessUrl("/")
//                .permitAll();
//    }
//
//    private void configureLogout(HttpSecurity http) throws Exception {
//        http.logout(Customizer.withDefaults())
//                .permitAll()
//                .logoutSuccessUrl("/");
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//
//                            // Настройка для входа в систему
//                            and().formLogin(Customizer.withDefaults())
//                            .loginPage("/login")
//                            // Переадресация на главную страницу после успешного входа
//                            .defaultSuccessUrl("/")
//                            .permitAll()
//                            .and()
//                            .logout()
//                            .permitAll()
//                            .logoutSuccessUrl("/");
//                })
//
//
//
//        return http.build();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}