import Header from"../Components/Header";
import Footer from "../Components/Footer";
import navBar from "../Components/NavBar";
import LoginButton from "../Components/LoginButton";
import RegistrationButton from "../Components/RegistrationButton";


export default function mainPage(){
    return(
    <>
    <div>{Header}</div>
    <div>{navBar}</div>

    <div>
        <h2>Don't have an account? Register Here! {RegistrationButton}</h2>
        <h2> Log In Here {LoginButton}</h2>
    </div>



    <div>{Footer}</div>
    </>)
}