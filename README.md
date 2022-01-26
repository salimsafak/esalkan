# Test Automation Example Tasks
> ## This repository contains some sample testing tasks for those who are interested. New tasks and scenarios will be added and developed over the time...

<details>
  <summary><strong>Contribution Guide</strong></summary>
      <h2><u>Step 1</u>: Sign into GitHub</h2>
      <p>Sign into your GitHub account, or <a href="https://github.com/join">create a free GitHub account</a> if you don't have one.</p>
      <h2><u>Step 2</u>: Fork the project repository</h2>
      <p>Find the project's repository on GitHub, and then "fork" it by clicking the <strong>Fork</strong> button in the upper right corner:</p> 
      <div align="center">
        <p>
          <img src="/img/step2.png" alt="Forking a GitHub repository">
        </p>
      </div>
  <div align="center">
<p><img src="/img/step2-1.png" alt="Looking at a fork in your GitHub account"></p>
</div>
  <h2><u>Step 3</u>: Clone your fork</h2>
  <p>While still in your repository, click the green <strong>Clone or download</strong> button and then copy the HTTPS URL:</p>
  <div align="center">
<p><img src="/img/step3.png" alt="Cloning your fork with HTTPS"></p>
</div>
  <p>Using Git on your local machine, clone your fork using the URL you just copied: <code>git clone URL_OF_FORK</code>.</p>
  <p>For example, I used <code>git clone https://github.com/esalkan/TestAutomationTasks.git</code>.</p>
  <p>Cloning copies the repository files (and commit history) from GitHub to your local machine. The repository will be downloaded into a subdirectory of your working directory, and the subdirectory will have the same name as the repository.</p>
  <h2><u>Step 4</u>: Navigate to your local repository</h2>
  <p>Since the clone was downloaded into a subdirectory of your working directory, you can navigate to it using: <code>cd NAME_OF_REPOSITORY</code>.</p>
  <h2><u>Step 5</u>: Check that your fork is the "origin" remote</h2>
  <p>You are going to be synchronizing your local repository with both the project repository (on GitHub) and your fork (also on GitHub). The URLs that point to these repositories are called "remotes". More specifically, the project repository is called the "upstream" remote, and your fork is called the "origin" remote.</p>
  <p>When you cloned your fork, that should have automatically set your fork as the "origin" remote. Use <code>git remote -v</code> to show your current remotes. You should see the URL of your fork (which you copied in step 3) next to the word "origin".</p>
  <p>If you don't see an "origin" remote, you can add it using: <code>git remote add origin URL_OF_FORK</code>.</p>
  <h2><u>Step 6</u>: Add the project repository as the "upstream" remote</h2>
  <p>Go to your fork on GitHub, and click the "forked from" link to return to the project repository:</p>
  <div align="center">
<p><img src="/img/step6.png" alt="Link from your fork to the project repository"></p>
</div>
  <p>While in the project repository, click the green <strong>Clone or download</strong> button and then copy the HTTPS URL:</p>
  <div align="center">
<p><img src="/img/step6-1.png" alt="Cloning the project repository with HTTPS"></p>
</div>
  <p>Add the project repository as the "upstream" remote using: <code>git remote add upstream URL_OF_PROJECT</code>.</p>
  <p>For example, I used <code>git remote add upstream https://github.com/codesofmine1/TestAutomationTaks.git</code>.</p>
  
  <p>Use <code>git remote -v</code> to check that you now have two remotes: an origin that points to your fork, and an upstream that points to the project repository.</p>
  <p>This diagram summarizes the entire setup process (steps 1 through 6):</p>
  <div align="center">
<p><img src="/img/step6-2" alt="Diagram of forking and cloning"></p>
</div>
</details>


<details>
  <summary><strong>CherCherTech Test Tasks Example</strong></summary>
  <ol>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/cherchertech/Task">Task List</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/cherchertech/CherCherTest.java">Test File</a>
    </li>
  </ol>
</details>

<details>
  <summary><strong>Amazon Test Tasks Example</strong></summary>
  <ol>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/amazon/Tasks">Task List</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/amazon/pages">Pages</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/amazon/tests">Tests</a>
    </li>
  </ol>
</details>

<details>
  <summary><strong>TodoMVC Test Tasks Example</strong></summary>
  <ol>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/todomvc/Taks">Task List</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/todomvc/pages">Pages</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/todomvc/tests">Tests</a>
    </li>
  </ol>
</details>

<details>
  <summary><strong>ZeroBANK Test Tasks Example</strong></summary>
  <ol>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/zerobank/Tasks">Task List</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/zerobank/pages">Pages</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/zerobank/tests">Tests</a>
    </li>
  </ol>
</details>

<details>
  <summary><strong>Basic Navigation Test Task Example</strong></summary>
  <ol>
    <li>
      <a href="#">Task List</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/basicNavTest/utilities">Task Utils</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/basicNavTest/NavTest.java">Test Class</a>
    </li>
  </ol>
</details>

<details>
  <summary><strong> Binance BTC/USDT Average Calculate Task</strong></summary>
  <ol>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/binance/Task">Task List</a><br>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/binance/BtcUsdt.java">Test Class</a>
    </li>
  </ol>
</details>
