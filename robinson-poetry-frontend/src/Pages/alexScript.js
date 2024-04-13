export default function alexCiscotoExtreme(){
    // Get user input of cisco configs to make objects
    const input = require('readline-sync');

    let ciscoInput= input.question("Enter your Cisco configuration: ");
    
ciscoInput.split("!")


    
    //create array of objects that holds the cisco information

    let ciscoSwitches=[]

    ciscoSwitches.push()

    let ciscoSwitchOne={
        interface_TenGigabitEthernet: "4/0/7",
        description: "1148",
        switchport_access_vlan: "",
        switchport_mode_access: "",
        switchport_voice_vlan: "",
        switchport_port_security_maximum: "",
        switchport_port_security: "",
        storm_control_braodcast_level: "",
        spanningtree_port_fast: ""

    }

   

    
    //get user input for which vlan's we are converting to isids

    //print new extreme configuration for assigning isids to a port
}