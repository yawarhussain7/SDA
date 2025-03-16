# SDA
<h1>Author Yawar Hussain</h1>
<h4>Section BSE 5C </h4>

<h2>Software Designing Principle </h2>
Project: VideoStore Management System <a href="https://www.dropbox.com/scl/fo/ede3xraw90e7epfitbjvl/AK9iDXHYYPvmClEhrQ82eGQ?rlkey=refupc50hx6r378ew1eprczxp&st=u8bsvcdp&dl=0">Watch Project</a>
<strong>Principle: Creator</strong>
<p><strong>Problem</strong>
    In a Video Shop Management System, the system should handle customers, video rentals, and video stock. The challenge is to decide which class should be responsible for creating instances of other classes 
</p>

<p> <strong>Solution</strong>
    <li style="disc"> GRASP Creator suggests that a class that contains or closely interacts with another class should create instances of that class.</li>
    <li style="disc">This improves maintainability, reduces code duplication, and follows object-oriented principles.</li></p>
<p> <strong>Structure</strong>
    <li style="disc"> Principle Package </li>
        <li style="disc"> With Out Principle </li></p>
        <li style="disc"> With Principle </li></p>

<p> <strong>Benifit</strong>
    <li style="disc">  Loose Coupling: VideoShop doesn’t need to know how Video is created. </li>
        <li style="disc">  High Cohesion: Video creation logic is encapsulated in VideoFactory.</li></p>
        <li style="disc"> Easier Maintenance: If video creation changes (e.g., adding metadata), we only update VideoFactory </li></p>



<h3>Working Process</h3>
<ul style="list-style-type:square">With-Out-Principle</ul>
<p>
    In Video class there are two members:
        title
        size
    which are directly accessible and changed in VMS class which voilate the working flow and dependencies efficiency etc<p>
<ul style="list-style-type:square">With-Principle</ul>
<p>
    In Video class there are two members:
        title
        size
    which are properly managed and modified by Video Factory class<p>
<p>Get more detail about it <a href="https://github.com/yawarhussain7/SDA" >Visit GitHub</a></p>