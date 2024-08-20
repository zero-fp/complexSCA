import os
import subprocess


def validate_demo():
    ROOT = os.path.dirname(os.path.realpath(__file__))

    for proj in [f for f in sorted(os.listdir(ROOT)) if os.path.isdir(os.path.join(ROOT, f))]:
        curr_folder = os.path.join(ROOT, proj, 'project')
        rc = subprocess.call(['mvn', 'clean', 'package'], cwd=curr_folder, stdout=subprocess.DEVNULL,
                             stderr=subprocess.DEVNULL)

        p = subprocess.run(['mvn', 'exec:java'], cwd=curr_folder, stdout=subprocess.PIPE, stderr=subprocess.DEVNULL)
        result = p.stdout.decode()
        if result.find('Validate OK') != -1:
            print('Validate OK - {:s}'.format(proj))
        else:
            print('Validate fail - {:s}'.format(proj))


validate_demo()
