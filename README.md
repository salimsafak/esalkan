# Test Automation Example Tasks
> ## This repository contains some sample testing tasks for those who are interested. New tasks and scenarios will be added and developed over the time... Please feel free for contributing....

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

<details>
  <summary><strong>Vytrack Test Tasks Example (<a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/vytrack">Package</a>)</strong></summary>
  <ol>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/blob/master/src/test/java/com/vytrack/Tasks">Task List</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/vytrack/pages">Pages</a>
    </li>
    <li>
      <a href="https://github.com/esalkan/TestAutomationTasks/tree/master/src/test/java/com/vytrack/tests">Tests</a>
    </li>
  </ol>
</details>



## Contribution Guide

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
<p><img src="/img/diagram-2.png" alt="Diagram of forking and cloning"></p>
</div>
  
  <h2><u>Step 7</u>: Pull the latest changes from upstream into your local repository</h2>
  <p>If you forked and cloned the project repository just a few minutes ago, it's very unlikely there will be any changes, in which case Git will report that your local repository is "already up to date". But if there are any changes, they will automatically be merged into your local repository.</p>
  <h2><u>Step 8</u>: Create a new branch</h2>
  <p>Rather than making changes to the project's "master" branch, it's a good practice to instead create your own branch. This creates an environment for your work that is isolated from the master branch.</p>
  <p>Use <code>git checkout -b BRANCH_NAME</code> to create a new branch and then immediately switch to it. The name of the branch should briefly describe what you are working on, and should not contain any spaces.</p>
  <p>For example, <code>git checkout -b new-testcase</code> because I was making some small fixes to the documentation.</p>
  <p>Use <code>git branch</code> to show your local branches. You should see your new branch as well as "master", and your new branch should have an asterisk next to it to indicate that it's "checked out" (meaning that you're working in it).</p>
  <h2><u>Step 9</u>: Make changes in your local repository</h2>
  <p>Use a text editor or IDE to make the changes you planned to the files in your local repository. Because you checked out a branch in the previous step, any edits you make will only affect that branch.</p>
  <h2><u>Step 10</u>: Commit your changes</h2>
  <p>After you make a set of changes, use <code>git add -A</code> to stage your changes and <code>git commit -m "DESCRIPTION OF CHANGES"</code> to commit them.</p>
  <p>For example, <code>git commit -m "New Test Case"</code> for one of commits.</p>
  <p>If you are making multiple sets of changes, it's a good to make a commit after each set.</p>
  <h2><u>Step 11</u>: Push your changes to your fork</h2>
  <p>When you are done making all of your changes, upload these changes to your fork using <code>git push origin BRANCH_NAME</code>. This "pushes" your changes to the "BRANCH_NAME" branch of the "origin" (which is your fork on GitHub).</p>
  <p>For example, <code>git push origin new-testcase</code>.</p>
  
  <h2><u>Step 12</u>: Begin the pull request</h2>
  <p>Return to your fork on GitHub, and refresh the page. You may see a highlighted area that displays your recently pushed branch:</p>
  <div align="center">
<p><img src="/img/step12.png" alt="Recently pushed branch in your fork"></p>
</div>
<p>Click the green <strong>Compare &amp; pull request</strong> button to begin the pull request.</p>
<p>(Alternatively, if you don't see this highlighted area, you can switch to your branch using the <strong>Branch</strong> button and then click the <strong>New pull request</strong> button.)</p>
<h2><u>Step 13</u>: Create the pull request</h2>
<p>When opening a "pull request", you are making a "request" that the project repository "pull" changes from your fork. You will see that the project repository is listed as the "base repository", and your fork is listed as the "head repository":</p>
<div align="center">
<p><img src="/img/step13.png" alt="Opening a GitHub pull request"></p>
</div>
<p>Before submitting the pull request, you first need to describe the changes you made (rather than asking the project maintainers to figure them out on their own). You should write a descriptive title for your pull request, and then include more details in the body of the pull request. If there are any related GitHub issues, make sure to mention those by number. The body can include Markdown formatting, and you can click the <strong>Preview</strong> tab to see how it will look.</p>
<p>Below the pull request form, you will see a list of the commits you made in your branch, as well as the "diffs" for all of the files you changed.</p>
<p>If everything looks good, click the green <strong>Create pull request</strong> button!</p>
<p>This diagram summarizes the entire pull request process process (steps 7 through 13):</p>
<div align="center">
<p><img src="/img/step13diagram.png" alt="Diagram of the pull request process"></p>
</div>
<h2><u>Step 14</u>: Review the pull request</h2>
<p>You have now created a pull request, which is stored in the project's repository (not in your fork of the repository). It's a good idea to read through what you wrote, as well as clicking on the <strong>Commits</strong> tab and the <strong>Files changed</strong> tab to review the contents of your pull request:</p>
<div align="center">
<p><img src="/img/step14.png" alt="Reviewing an open pull request"></p>
</div>
<p>If you realize that you left out some important details, you can click the 3 dots in the upper right corner to edit your pull request description.</p>
<h2><u>Step 15</u>: Discuss the pull request</h2>
<p>If there are questions or discussion about your pull request from the project maintainers, you can add to the conversation using the comment box at the bottom of the pull request:</p>
<div align="center">
<p><img src="/img/step15.png" alt="Commenting on a pull request"></p>
</div>
<h2><u>Step 16</u>: Delete your branch from your fork</h2>
<p>If the project maintainers accept your pull request (congratulations!), they will merge your proposed changes into the project's master branch and close your pull request:</p>
<p>You will be given the option to delete your branch from your fork, since it's no longer of any use:</p>
<div align="center">
<p><img src="/img/step16.png" alt="Merging a pull request"></p>
</div>
<h2><u>Step 17</u>: Delete your branch from your local repository</h2>
<p>You should also delete the branch you created from your local repository, so that you don't accidentally start working in it the next time you want to make a contribution to this project.</p>
<p>First, switch to the master branch: <code>git checkout master</code>.</p>
<p>Then, delete the branch you created: <code>git branch -D BRANCH_NAME</code>. For example, <code>git branch -D new-testcase</code>.</p>
<h2><u>Step 18</u>: Synchronize your fork with the project repository</h2>
<p>At this point, your fork is out of sync with the project repository's master branch.</p>
<p>To get it back in sync, you should first use Git to pull the latest changes from "upstream" (the project repository) into your local repository: <code>git pull upstream master</code>.</p>
<p>Then, push those changes from your local repository to the "origin" (your fork): <code>git push origin master</code>.</p>
<p>If you return to your fork on GitHub, you can make fetch-upstream too:</p>
<div align="center">
<p><img src="/img/lastStep.png" alt="Fork is even with the project repository"></p>
</div>
<h2>🎉 Congratulations! Thank you for your Contributing</h2>
