import LoginButton from "../Components/LoginButton"
import RegistrationButton from "../Components/RegistrationButton"
import loginForm from "./LoginForm"

export default function homePage(){
    return(
        <>
        <h1>Welcome to the Writing Robin</h1>
        <div className="buttons">
            <a href="/LoginForm">
                {`${LoginButton}`}
            </a>
        </div>

        </>
    )
}